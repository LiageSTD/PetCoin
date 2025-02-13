package org.coinpet.petcoin.repository;

import org.coinpet.petcoin.crypto.clients.CoinCap.dto.Assets;

public interface CoinRepository {

    void addNewCurrency(Assets.Currency currency);

    void updateCurrency(Assets.Currency currency);

    void updateAssets(Assets assets);

    void deleteCurrencyByName(String name);

    Assets.Currency findCurrencyByName(String name);

    Integer getCurrencyIdByName(String name);
}
