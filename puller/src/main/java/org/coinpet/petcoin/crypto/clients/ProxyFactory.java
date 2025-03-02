package org.coinpet.petcoin.crypto.clients;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.coinpet.petcoin.config.ApplicationConfig;
import org.coinpet.petcoin.config.apiConfiguration.CoinCapApiConfiguration;
import org.coinpet.petcoin.crypto.clients.CoinCap.CoinCapClient;
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

    @Bean
    public CoinCapClient CoinCapClient() {
        return CoinCapClient(CoinCapApiConfiguration.API_VERSION);
    }


}
