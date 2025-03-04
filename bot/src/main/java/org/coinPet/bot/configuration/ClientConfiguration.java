package org.coinPet.bot.configuration;

import org.coinPet.bot.clients.CurrencyClient;
import org.coinPet.bot.clients.UserClient;
import org.coinPet.bot.configuration.apiConfiguration.PullerCurrencyClientConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import org.coinPet.bot.configuration.apiConfiguration.PullerUserClientConfiguration;
import java.util.Map;

@Configuration
public class ClientConfiguration {
    public static <S> S createClient(Class<S> clientClass, Map<String, String> headers, String baseUrl) {
        WebClient.Builder webclientBuilder = WebClient.builder().baseUrl(baseUrl);
        headers.forEach(webclientBuilder::defaultHeader);
        WebClient webClient = webclientBuilder.build();

        HttpServiceProxyFactory clientFactory =
                HttpServiceProxyFactory.builderFor(WebClientAdapter.create(webClient)).build();
        return clientFactory.createClient(clientClass);
    }

    public UserClient pullerUserClient(String url) {
        return createClient(UserClient.class, Map.of(
                "Content-Type", PullerUserClientConfiguration.CONTENT_TYPE,
                "Accept", PullerUserClientConfiguration.ACCEPT
        ), url);
    }

    public CurrencyClient pullerCurrencyClient(String url) {
        return createClient(CurrencyClient.class, Map.of(
                "Content-Type", PullerCurrencyClientConfiguration.CONTENT_TYPE,
                "Accept", PullerCurrencyClientConfiguration.ACCEPT
        ), url);
    }

    @Bean
    public UserClient pullerUserClient() {
        return pullerUserClient(PullerUserClientConfiguration.API_URL);
    }

    @Bean
    public CurrencyClient pullerCurrencyClient() {
        return pullerCurrencyClient(PullerCurrencyClientConfiguration.API_URL);
    }
}
