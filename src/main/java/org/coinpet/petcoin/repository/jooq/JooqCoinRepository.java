package org.coinpet.petcoin.repository.jooq;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.coinpet.petcoin.crypto.clients.CoinCap.dto.Assets;
import org.coinpet.petcoin.repository.CoinRepository;
import org.coinpet.petcoin.repository.jooq.model.public_.Tables;
import org.jooq.DSLContext;
import org.jooq.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
@AllArgsConstructor
public class JooqCoinRepository implements CoinRepository {
    DSLContext dsl;

    @Transactional
    @Override
    public void addNewCurrency(Assets.Currency currency) {
        log.info("Adding new currency: {}", currency.getName());

        dsl.insertInto(Tables.CRYPTOCURRENCIES)
//                .set(Tables.CRYPTOCURRENCIES.ID, Integer.parseInt(currency.getId()))
                .set(Tables.CRYPTOCURRENCIES.NAME, currency.getName())
                .set(Tables.CRYPTOCURRENCIES.SYMBOL, currency.getSymbol())
                .set(Tables.CRYPTOCURRENCIES.RANK, currency.getRank())
                .execute();
        Integer newID = dsl.lastID().intValue();
                dsl.insertInto(Tables.MARKET_DATA)
                .set(Tables.MARKET_DATA.CRYPTO_ID, newID)
                .set(Tables.MARKET_DATA.TIMESTAMP, LocalDateTime.now())
                .set(Tables.MARKET_DATA.PRICE, BigDecimal.valueOf(currency.getPriceUSD()))
                .set(Tables.MARKET_DATA.SUPPLY, BigDecimal.valueOf(currency.getSupply()))
                .set(Tables.MARKET_DATA.MAX_SUPPLY, BigDecimal.valueOf(currency.getMaxSupply()))
                .set(Tables.MARKET_DATA.VOLUME_USD, BigDecimal.valueOf(currency.getVolumeUsd24Hr()))
                .set(Tables.MARKET_DATA.MARKET_CAP, BigDecimal.valueOf(currency.getMarketCapUsd()))
                .execute();
    }

    @Transactional
    @Override
    public void updateCurrency(Assets.Currency currency) {
        Integer id = findCurrencyIDBySymbol(currency.getSymbol());
        if (id == null) {
            addNewCurrency(currency);
            return;
        }
        dsl.update(Tables.MARKET_DATA)
                .set(Tables.MARKET_DATA.CRYPTO_ID, id)
                .set(Tables.MARKET_DATA.TIMESTAMP, LocalDateTime.now())
                .set(Tables.MARKET_DATA.PRICE, BigDecimal.valueOf(currency.getPriceUSD()))
                .set(Tables.MARKET_DATA.SUPPLY, BigDecimal.valueOf(currency.getSupply()))
                .set(Tables.MARKET_DATA.MAX_SUPPLY, BigDecimal.valueOf(currency.getMaxSupply()))
                .set(Tables.MARKET_DATA.VOLUME_USD, BigDecimal.valueOf(currency.getVolumeUsd24Hr()))
                .set(Tables.MARKET_DATA.MARKET_CAP, BigDecimal.valueOf(currency.getMarketCapUsd()))
                .execute();
    }

    @Transactional
    @Override
    public void updateAssets(Assets assets) {
        List<Query> updateQueries = new ArrayList<>();

        for (Assets.Currency currency : assets.getCurrencyList()) {
            Integer cryptoId = findCurrencyIDBySymbol(currency.getSymbol());

            if (cryptoId == null) {
                addNewCurrency(currency);
                continue;
            }

            Query updateQuery = dsl.update(Tables.MARKET_DATA)
                    .set(Tables.MARKET_DATA.CRYPTO_ID, cryptoId)
                    .set(Tables.MARKET_DATA.TIMESTAMP, LocalDateTime.now())
                    .set(Tables.MARKET_DATA.PRICE, BigDecimal.valueOf(currency.getPriceUSD()))
                    .set(Tables.MARKET_DATA.SUPPLY, BigDecimal.valueOf(currency.getSupply()))
                    .set(Tables.MARKET_DATA.MAX_SUPPLY, BigDecimal.valueOf(currency.getMaxSupply()))
                    .set(Tables.MARKET_DATA.VOLUME_USD, BigDecimal.valueOf(currency.getVolumeUsd24Hr()))
                    .set(Tables.MARKET_DATA.MARKET_CAP, BigDecimal.valueOf(currency.getMarketCapUsd()));
            updateQueries.add(updateQuery);
        }

        if (!updateQueries.isEmpty()) {
            dsl.batch(updateQueries).execute();
        }
    }

    @Override
    public void deleteCurrencyByName(String name) {
        dsl.delete(Tables.CRYPTOCURRENCIES)
                .where(Tables.CRYPTOCURRENCIES.NAME.eq(name))
                .execute();
    }

    @Override
    public Assets.Currency findCurrencyByName(String name) {
        return dsl.select(
                        Tables.CRYPTOCURRENCIES.ID,
                        Tables.CRYPTOCURRENCIES.NAME,
                        Tables.CRYPTOCURRENCIES.SYMBOL,
                        Tables.CRYPTOCURRENCIES.RANK,
                        Tables.MARKET_DATA.TIMESTAMP,
                        Tables.MARKET_DATA.PRICE.as("priceUSD"),
                        Tables.MARKET_DATA.SUPPLY,
                        Tables.MARKET_DATA.MAX_SUPPLY,
                        Tables.MARKET_DATA.VOLUME_USD.as("volumeUsd24Hr"),
                        Tables.MARKET_DATA.MARKET_CAP.as("marketCapUsd")
                ).from(Tables.CRYPTOCURRENCIES)
                .join(Tables.MARKET_DATA)
                .on(Tables.CRYPTOCURRENCIES.ID.eq(Tables.MARKET_DATA.CRYPTO_ID))
                .where(Tables.CRYPTOCURRENCIES.NAME.eq(name))
                .fetchOneInto(Assets.Currency.class);
    }

    private Integer findCurrencyIDBySymbol(String symbol) {
        return dsl.select(Tables.CRYPTOCURRENCIES.ID)
                .from(Tables.CRYPTOCURRENCIES)
                .where(Tables.CRYPTOCURRENCIES.SYMBOL.eq(symbol))
                .fetchOneInto(Integer.class);
    }

}
