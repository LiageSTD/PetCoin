package org.coinpet.petcoin.crypto.clients.coincap;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.coinpet.dto.puller.Assets;
import org.coinpet.petcoin.crypto.clients.ProxyFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CoinCapClientTest {
    private CoinCapClient coinCapClient;
    private WireMockServer wireMockServer;

    private String RESPONSE_FOR_ASSETS_REQUEST = "{\n" +
            "    \"data\": [\n" +
            "        {\n" +
            "            \"id\": \"bitcoin\",\n" +
            "            \"rank\": \"1\",\n" +
            "            \"symbol\": \"BTC\",\n" +
            "            \"name\": \"Bitcoin\",\n" +
            "            \"supply\": \"19844975.0000000000000000\",\n" +
            "            \"maxSupply\": \"21000000.0000000000000000\",\n" +
            "            \"marketCapUsd\": \"1660305816691.2040105109039625\",\n" +
            "            \"volumeUsd24Hr\": \"10179087956.6354280153437816\",\n" +
            "            \"priceUsd\": \"83663.7897851322065415\",\n" +
            "            \"changePercent24Hr\": \"1.7742504279770672\",\n" +
            "            \"vwap24Hr\": \"83196.6043314066360551\",\n" +
            "            \"explorer\": \"https://blockchain.info/\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"ethereum\",\n" +
            "            \"rank\": \"2\",\n" +
            "            \"symbol\": \"ETH\",\n" +
            "            \"name\": \"Ethereum\",\n" +
            "            \"supply\": \"120659504.7581715100000000\",\n" +
            "            \"maxSupply\": null,\n" +
            "            \"marketCapUsd\": \"226210264921.0113978110043004\",\n" +
            "            \"volumeUsd24Hr\": \"6290492432.8225792801237538\",\n" +
            "            \"priceUsd\": \"1874.7819773865895810\",\n" +
            "            \"changePercent24Hr\": \"3.2644575259320585\",\n" +
            "            \"vwap24Hr\": \"1842.2893108746023682\",\n" +
            "            \"explorer\": \"https://etherscan.io/\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"tether\",\n" +
            "            \"rank\": \"3\",\n" +
            "            \"symbol\": \"USDT\",\n" +
            "            \"name\": \"Tether\",\n" +
            "            \"supply\": \"143992979510.8807700000000000\",\n" +
            "            \"maxSupply\": null,\n" +
            "            \"marketCapUsd\": \"144008663467.7465763866993800\",\n" +
            "            \"volumeUsd24Hr\": \"25899009832.6389778244177412\",\n" +
            "            \"priceUsd\": \"1.0001089216774254\",\n" +
            "            \"changePercent24Hr\": \"-0.0502030945120981\",\n" +
            "            \"vwap24Hr\": \"0.9999850355257181\",\n" +
            "            \"explorer\": \"https://www.omniexplorer.info/asset/31\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"xrp\",\n" +
            "            \"rank\": \"4\",\n" +
            "            \"symbol\": \"XRP\",\n" +
            "            \"name\": \"XRP\",\n" +
            "            \"supply\": \"58205697378.0000000000000000\",\n" +
            "            \"maxSupply\": \"100000000000.0000000000000000\",\n" +
            "            \"marketCapUsd\": \"125315591290.4851429204054074\",\n" +
            "            \"volumeUsd24Hr\": \"1897612646.6034739489702540\",\n" +
            "            \"priceUsd\": \"2.1529780921042733\",\n" +
            "            \"changePercent24Hr\": \"3.5268476966710173\",\n" +
            "            \"vwap24Hr\": \"2.1210225240364390\",\n" +
            "            \"explorer\": \"https://xrpcharts.ripple.com/#/graph/\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"binance-coin\",\n" +
            "            \"rank\": \"5\",\n" +
            "            \"symbol\": \"BNB\",\n" +
            "            \"name\": \"BNB\",\n" +
            "            \"supply\": \"144006830.0000000000000000\",\n" +
            "            \"maxSupply\": \"144006830.0000000000000000\",\n" +
            "            \"marketCapUsd\": \"88367303751.0136043112349550\",\n" +
            "            \"volumeUsd24Hr\": \"347719751.2423238337723200\",\n" +
            "            \"priceUsd\": \"613.6327266631284385\",\n" +
            "            \"changePercent24Hr\": \"2.6911483081322382\",\n" +
            "            \"vwap24Hr\": \"607.9026198502335958\",\n" +
            "            \"explorer\": \"https://etherscan.io/token/0xB8c77482e45F1F44dE1745F52C74426C631bDD52\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"solana\",\n" +
            "            \"rank\": \"6\",\n" +
            "            \"symbol\": \"SOL\",\n" +
            "            \"name\": \"Solana\",\n" +
            "            \"supply\": \"512506289.0899812600000000\",\n" +
            "            \"maxSupply\": null,\n" +
            "            \"marketCapUsd\": \"65570388387.7837673871599441\",\n" +
            "            \"volumeUsd24Hr\": \"1707306893.1929825175091709\",\n" +
            "            \"priceUsd\": \"127.9406512341773554\",\n" +
            "            \"changePercent24Hr\": \"2.6068746755406638\",\n" +
            "            \"vwap24Hr\": \"126.3185067618797622\",\n" +
            "            \"explorer\": \"https://explorer.solana.com/\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"usd-coin\",\n" +
            "            \"rank\": \"7\",\n" +
            "            \"symbol\": \"USDC\",\n" +
            "            \"name\": \"USDC\",\n" +
            "            \"supply\": \"60093692597.8278960000000000\",\n" +
            "            \"maxSupply\": null,\n" +
            "            \"marketCapUsd\": \"60114382570.9164266873567720\",\n" +
            "            \"volumeUsd24Hr\": \"5470460412.7437836448336642\",\n" +
            "            \"priceUsd\": \"1.0003442952528645\",\n" +
            "            \"changePercent24Hr\": \"0.0716462656648932\",\n" +
            "            \"vwap24Hr\": \"1.0000800997537747\",\n" +
            "            \"explorer\": \"https://etherscan.io/token/0xa0b86991c6218b36c1d19d4a2e9eb0ce3606eb48\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"dogecoin\",\n" +
            "            \"rank\": \"8\",\n" +
            "            \"symbol\": \"DOGE\",\n" +
            "            \"name\": \"Dogecoin\",\n" +
            "            \"supply\": \"148670906383.7052000000000000\",\n" +
            "            \"maxSupply\": null,\n" +
            "            \"marketCapUsd\": \"25487486330.1067870768567394\",\n" +
            "            \"volumeUsd24Hr\": \"580117249.2230009297099342\",\n" +
            "            \"priceUsd\": \"0.1714356019618664\",\n" +
            "            \"changePercent24Hr\": \"5.6286751377869465\",\n" +
            "            \"vwap24Hr\": \"0.1680225277134918\",\n" +
            "            \"explorer\": \"http://dogechain.info/chain/Dogecoin\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"cardano\",\n" +
            "            \"rank\": \"9\",\n" +
            "            \"symbol\": \"ADA\",\n" +
            "            \"name\": \"Cardano\",\n" +
            "            \"supply\": \"35268011575.2034400000000000\",\n" +
            "            \"maxSupply\": \"45000000000.0000000000000000\",\n" +
            "            \"marketCapUsd\": \"23963610785.1556701827346775\",\n" +
            "            \"volumeUsd24Hr\": \"399740728.5249381624610021\",\n" +
            "            \"priceUsd\": \"0.6794715583569851\",\n" +
            "            \"changePercent24Hr\": \"6.0744498045695813\",\n" +
            "            \"vwap24Hr\": \"0.6629916581809242\",\n" +
            "            \"explorer\": \"https://cardanoexplorer.com/\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"tron\",\n" +
            "            \"rank\": \"10\",\n" +
            "            \"symbol\": \"TRX\",\n" +
            "            \"name\": \"TRON\",\n" +
            "            \"supply\": \"94990240225.6367000000000000\",\n" +
            "            \"maxSupply\": null,\n" +
            "            \"marketCapUsd\": \"22336843501.5506779945598986\",\n" +
            "            \"volumeUsd24Hr\": \"284426698.5571949805362316\",\n" +
            "            \"priceUsd\": \"0.2351488263267097\",\n" +
            "            \"changePercent24Hr\": \"0.6657894400416579\",\n" +
            "            \"vwap24Hr\": \"0.2369900443873504\",\n" +
            "            \"explorer\": \"https://tronscan.org/#/\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"timestamp\": 1743515857945\n" +
            "}";

    @BeforeEach
    void init() {
        wireMockServer = new WireMockServer(9080);
        wireMockServer.start();
        configureFor("localhost", 9080);
        coinCapClient = ProxyFactory.CoinCapClientForTests(wireMockServer.baseUrl());
    }

    @AfterEach
    void close() {
        wireMockServer.stop();
    }

    @Test
    void should_process_stats_request_and_reply_correctly() {
        stubFor(get("/assets?limit=10")
                .willReturn(
                        aResponse()
                                .withBody(RESPONSE_FOR_ASSETS_REQUEST)
                                .withStatus(200)
                                .withHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                )
        );
        Assets receivedResponse = coinCapClient.getAvailableCurrencies(10);
        assertEquals(10, receivedResponse.getCurrencyList().size());
        assertEquals("BTC", receivedResponse.getCurrencyList().getFirst().getSymbol());
    }

}
