package org.coinpet.bot.clients;

import org.coinpet.dto.puller.Assets;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

public interface CurrencyClient {
    @GetExchange("/crypto/v1/currency/{symbol}")
    Assets.Currency getCurrency(@PathVariable("symbol") String symbol);

    @GetExchange("/crypto/v1/currency/stats/{symbol}")
    Assets getCurrencyStats(@PathVariable("symbol") String symbol);

}
