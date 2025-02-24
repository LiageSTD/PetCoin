package org.coinpet.petcoin.repository.jooq;

import lombok.extern.slf4j.Slf4j;
import org.coinpet.petcoin.crypto.clients.CoinCap.dto.Assets;
import org.coinpet.petcoin.repository.CoinRepository;
import org.coinpet.petcoin.repository.IntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(properties = "app.scheduler.enabled=false")
@Slf4j
class JooqCoinRepositoryTest extends IntegrationTest {
    @Autowired
    CoinRepository coinRepository;

    @Test
    @Transactional
    @Rollback
    void addNewCurrencyTest() {
        Assets.Currency testData = new Assets.Currency(
                "1",
                1,
                "BTC",
                "Bitcoin",
                (float) 0.11,
                (float) 100.01,
                (float) 100000.11,
                (float) 12300123.01,
                (float) 200
        );
        coinRepository.addNewCurrency(testData);

        Assets.Currency reply = coinRepository.findCurrencyBySymbol(testData.getSymbol());

        testData.setId(reply.getId());

        assertEquals(testData, reply);
    }
    @Transactional
    @Rollback
    @Test
    void updateCurrencyTest() {
        Assets.Currency testData = new Assets.Currency(
                "1",
                1,
                "BTC",
                "Bitcoin",
                (float) 0.11,
                (float) 100.01,
                (float) 100000.11,
                (float) 12300123.01,
                (float) 200
        );
        Assets.Currency updatedData = new Assets.Currency(
                "1",
                1,
                "BTC",
                "Bitcoin",
                (float) 0.20,
                (float) 102.03,
                (float) 100231.23,
                (float) 12123123123.02,
                (float) 100
        );

        coinRepository.addNewCurrency(testData);

        Assets.Currency reply = coinRepository.findCurrencyBySymbol(testData.getSymbol());

        testData.setId(reply.getId());

        assertEquals(testData, reply);

        assertTrue(coinRepository.updateCurrency(updatedData));

        Assets.Currency secondReply = coinRepository.findCurrencyBySymbol(updatedData.getSymbol());

        updatedData.setId(secondReply.getId());

        assertEquals(updatedData, secondReply);
    }

    @Test
    @Transactional
    @Rollback
    void updateNewCurrency() {
        Assets.Currency updatedData = new Assets.Currency(
                "1",
                1,
                "BTC",
                "Bitcoin",
                (float) 0.20,
                (float) 102.03,
                (float) 100231.23,
                (float) 12123123123.02,
                (float) 100
        );

        coinRepository.updateCurrency(updatedData);
        Assets.Currency reply = coinRepository.findCurrencyBySymbol(updatedData.getSymbol());
        log.debug(reply.toString());
        updatedData.setId(reply.getId());
        log.debug(updatedData.toString());

        assertEquals(updatedData, reply);
    }

    @Test
    @Transactional
    @Rollback
    void updateNewAsset() {
        Assets assets = new Assets();
        assets.setCurrencyList(List.of(
                new Assets.Currency(
                        "1",
                        1,
                        "BTC",
                        "Bitcoin",
                        (float) 0.11,
                        (float) 100.01,
                        (float) 100000.11,
                        (float) 12300123.01,
                        (float) 200
                ),
                new Assets.Currency(
                        "2",
                        2,
                        "ETH",
                        "Ethereum",
                        (float) 0.20,
                        (float) 102.03,
                        (float) 100231.23,
                        (float) 12123123123.02,
                        (float) 100
                )
        ));

        coinRepository.updateAssets(assets);
        Assets.Currency a = coinRepository.findCurrencyBySymbol("Bitcoin");
        for (Assets.Currency currency : assets.getCurrencyList()) {
            Assets.Currency reply = coinRepository.findCurrencyBySymbol(currency.getSymbol());
            assertEquals(currency, reply);
        }
    }

    @Test
    @Transactional
    @Rollback
    void deleteCurrencyBySymbolTest() {
        Assets.Currency testData = new Assets.Currency(
                "1",
                1,
                "BTC",
                "Bitcoin",
                (float) 0.11,
                (float) 100.01,
                (float) 100000.11,
                (float) 12300123.01,
                (float) 200
        );
        coinRepository.addNewCurrency(testData);
        coinRepository.deleteCurrencyBySymbol(testData.getSymbol());
        Assets.Currency reply = coinRepository.findCurrencyBySymbol(testData.getSymbol());


        assertNull(reply);
    }
}
