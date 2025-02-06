package org.coinpet.petcoin.crypto.service.currencyUpdater;

public interface CurrencyUpdater {
    void updateCurrency(String currency);

    void updateAllAvailableCurrencies();
}
