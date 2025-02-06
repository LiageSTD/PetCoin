package org.coinpet.petcoin.repository.jooq;

import org.coinpet.petcoin.crypto.clients.CoinCap.dto.Assets;
import org.coinpet.petcoin.repository.CoinRepository;
import org.coinpet.petcoin.repository.IntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
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

        assertEquals(testData, reply);

        coinRepository.updateCurrency(updatedData);

        reply = coinRepository.findCurrencyByName(updatedData.getName());

        assertEquals(updatedData, reply);
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
