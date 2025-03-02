package org.coinpet.petcoin.crypto.repository;

import org.coinpet.petcoin.crypto.clients.CoinCap.dto.Assets;

public interface CoinRepository {

    void addNewCurrency(Assets.Currency currency);

    boolean updateCurrency(Assets.Currency currency);

    void updateAssets(Assets assets);

    void deleteCurrencyBySymbol(String name);

    Assets.Currency findCurrencyBySymbol(String name);

    Integer getCurrencyIdByName(String name);

    Assets getCurrencyStatsBySymbol(String symbol);
}
