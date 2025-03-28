package org.coinpet.bot.service.currencyService;

import org.coinpet.dto.puller.Assets;

public interface CurrencyService {
    Assets.Currency getInfoAboutCurrency(String currencySymbol);

    Assets getStatsForCurrency(String currencySymbol);
}
