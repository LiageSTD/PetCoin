package org.coinpet.petcoin.crypto.clients;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.coinpet.petcoin.config.ApplicationConfig;
import org.coinpet.petcoin.config.api.BotClientApiConfiguration;
import org.coinpet.petcoin.config.api.CoinCapApiConfiguration;
import org.coinpet.petcoin.crypto.clients.bot.BotClient;
import org.coinpet.petcoin.crypto.clients.coincap.CoinCapClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Component
@AllArgsConstructor
public class ProxyFactory {

    @NotNull
    private ApplicationConfig aConfig;

    private WebClient makeClient(String url, String jsonCT, String apiVer) {
        return WebClient.builder()
                .codecs(codecs -> codecs.defaultCodecs().maxInMemorySize(aConfig.getWebClientMaxInMemorySize()))
                .baseUrl(url)
                .defaultHeader("Content-Type", jsonCT)
                .defaultHeader("Accept", apiVer)
                .build();
    }

    private CoinCapClient CoinCapClient(String coinCapUrl) {
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
        return CoinCapClient(CoinCapApiConfiguration.API_VERSION);
    }
    @Bean
    public BotClient BotClient() {return BotClient(BotClientApiConfiguration.API_VERSION);}

}
