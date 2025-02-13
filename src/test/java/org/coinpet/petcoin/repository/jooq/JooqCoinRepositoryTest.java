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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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

        Assets.Currency reply = coinRepository.findCurrencyByName(testData.getName());

        testData.setId(reply.getId());

        assertEquals(testData, reply);
    }

    @Test
    @Transactional
    @Rollback
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

        Assets.Currency reply = coinRepository.findCurrencyByName(updatedData.getName());

        testData.setId(reply.getId());

        assertEquals(testData, reply);

        coinRepository.updateCurrency(updatedData);

        reply = coinRepository.findCurrencyByName(updatedData.getName());

        updatedData.setId(reply.getId());

        assertEquals(updatedData, reply);
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
        Assets.Currency reply = coinRepository.findCurrencyByName(updatedData.getName());
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
        Assets.Currency a = coinRepository.findCurrencyByName("Bitcoin");
        for (Assets.Currency currency : assets.getCurrencyList()) {
            Assets.Currency reply = coinRepository.findCurrencyByName(currency.getName());
            assertEquals(currency, reply);
        }
    }

    @Test
    @Transactional
    @Rollback
    void deleteCurrencyByNameTest() {
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
        coinRepository.deleteCurrencyByName(testData.getName());
        Assets.Currency reply = coinRepository.findCurrencyByName(testData.getName());


        assertNull(reply);
    }
}
