package org.coinpet.petcoin.crypto.service.currencyUpdater;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.coinpet.petcoin.crypto.clients.CoinCap.CoinCapClient;
import org.coinpet.petcoin.crypto.clients.CoinCap.dto.Assets;
import org.coinpet.petcoin.repository.CoinRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class CurrencyUpdaterService implements CurrencyUpdater {
    CoinRepository coinRepository;
    CoinCapClient coinCapClient;

    @Override
    public void updateCurrency(String currencyName) {
        Assets.Currency currency = coinCapClient.getSpecificAsset(currencyName);
        coinRepository.updateCurrency(currency);
    }

    @Override
    public void updateAllAvailableCurrencies() {
        Assets assets = coinCapClient.getAvailableCurrencies();
        coinRepository.updateAssets(assets);
    }
}
