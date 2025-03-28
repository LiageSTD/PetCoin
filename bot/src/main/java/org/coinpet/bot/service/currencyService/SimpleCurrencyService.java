package org.coinpet.bot.service.currencyService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.coinpet.bot.clients.CurrencyClient;
import org.coinpet.dto.puller.Assets;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SimpleCurrencyService implements CurrencyService {

    private final CurrencyClient currencyClient;
    @Override
    public Assets.Currency getInfoAboutCurrency(String currencySymbol) {
        return currencyClient.getCurrency(currencySymbol);
    }

    @Override
    public Assets getStatsForCurrency(String currencySymbol) {
        return currencyClient.getCurrencyStats(currencySymbol);
    }
}
