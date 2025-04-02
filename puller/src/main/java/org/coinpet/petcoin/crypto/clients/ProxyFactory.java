package org.coinpet.petcoin.crypto.clients;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.coinpet.petcoin.config.ApplicationConfig;
import org.coinpet.petcoin.config.api.BotClientApiConfiguration;
import org.coinpet.petcoin.config.api.CoinCapApiConfiguration;
import org.coinpet.petcoin.crypto.clients.bot.BotClient;
import org.coinpet.petcoin.crypto.clients.coincap.CoinCapClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import reactor.util.retry.Retry;

import java.time.Duration;

@Component
@AllArgsConstructor
@Slf4j
public class ProxyFactory {

    @NotNull
    private ApplicationConfig aConfig;

    private WebClient makeClient(String url, String jsonCT, String apiVer) {
        return WebClient.builder()
                .codecs(codecs -> codecs.defaultCodecs().maxInMemorySize(aConfig.getWebClientMaxInMemorySize()))
                .baseUrl(url)
                .defaultHeader("Content-Type", jsonCT)
                .defaultHeader("Accept", apiVer)
                .filter(retryFilter())
                .build();
    }

    private ExchangeFilterFunction retryFilter() {
        return ((request, next) ->
            next.exchange(request)
                    .retryWhen(Retry.fixedDelay(3, Duration.ofSeconds(2)))
                    .log()
        );
    }

    // Maybe rework this method

    private static WebClient makeClientForTests(String url, String jsonCT, String apiVer) {
        return WebClient.builder()
                .baseUrl(url)
                .defaultHeader("Content-Type", jsonCT)
                .defaultHeader("Accept", apiVer)
                .build();
    }

    public static CoinCapClient CoinCapClientForTests(String coinCapURL) {
        HttpServiceProxyFactory clientFactory =
                HttpServiceProxyFactory.builderFor(WebClientAdapter.create(makeClientForTests(
                        coinCapURL,
                        CoinCapApiConfiguration.JSON_CONTENT_TYPE,
                        CoinCapApiConfiguration.API_VERSION
                ))).build();
        return clientFactory.createClient(CoinCapClient.class);
    }

    public CoinCapClient CoinCapClient(String coinCapUrl) {
        HttpServiceProxyFactory clientFactory =
                HttpServiceProxyFactory.builderFor(WebClientAdapter.create(makeClient(
                        coinCapUrl,
                        CoinCapApiConfiguration.JSON_CONTENT_TYPE,
                        CoinCapApiConfiguration.API_VERSION
                ))).build();
        return clientFactory.createClient(CoinCapClient.class);
    }

    private BotClient BotClient(String botClientUrl) {
        HttpServiceProxyFactory clientFactory =
                HttpServiceProxyFactory.builderFor(WebClientAdapter.create(makeClient(
                        botClientUrl,
                        BotClientApiConfiguration.JSON_CONTENT_TYPE,
                        BotClientApiConfiguration.API_VERSION
                ))).build();
        return clientFactory.createClient(BotClient.class);
    }

    @Bean
    public CoinCapClient CoinCapClient() {
        return CoinCapClient(CoinCapApiConfiguration.API_BASE_URL);
    }
    @Bean
    public BotClient BotClient() {return BotClient(BotClientApiConfiguration.API_BASE_URL);}

}
