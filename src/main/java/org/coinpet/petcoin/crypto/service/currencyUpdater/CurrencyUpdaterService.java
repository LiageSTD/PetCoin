package org.coinpet.petcoin.crypto.service.currencyUpdater;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.coinpet.petcoin.crypto.clients.CoinCap.CoinCapClient;
import org.coinpet.petcoin.crypto.clients.CoinCap.dto.Assets;
import org.coinpet.petcoin.repository.CoinRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

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
        log.info("Getting all available currencies ${}", LocalDateTime.now());
        Assets assets = coinCapClient.getAvailableCurrencies(2000);
        coinRepository.updateAssets(assets);
        log.info("All available currencies updated ${}", LocalDateTime.now());
    }
}
