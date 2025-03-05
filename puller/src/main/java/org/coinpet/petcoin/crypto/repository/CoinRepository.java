package org.coinpet.petcoin.crypto.repository;


import org.coinpet.dto.puller.Assets;

public interface CoinRepository {

    void addNewCurrency(Assets.Currency currency);

    boolean updateCurrency(Assets.Currency currency);

    void updateAssets(Assets assets);

    void deleteCurrencyBySymbol(String name);

    Assets.Currency findCurrencyBySymbol(String name);

    Integer getCurrencyIdBySymbol(String symbol);

    Assets getCurrencyStatsBySymbol(String symbol);
}
