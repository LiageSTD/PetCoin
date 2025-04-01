package org.coinpet.petcoin.crypto.clients.coincap;

import com.github.tomakehurst.wiremock.WireMockServer;
import lombok.RequiredArgsConstructor;
import org.coinpet.petcoin.crypto.clients.ProxyFactory;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.configureFor;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;

@SpringBootTest
@RequiredArgsConstructor
class CoinCapClientTest {
    private CoinCapClient coinCapClient;
    private WireMockServer wireMockServer;
    private final ProxyFactory proxyFactory;
    @BeforeEach
    void init() {
        wireMockServer = new WireMockServer();
        wireMockServer.start();
        configureFor("localhost", 8080);
        coinCapClient = proxyFactory.CoinCapClient(wireMockServer.baseUrl());
    }

    @AfterEach
    void close() {
        wireMockServer.stop();
    }

}
