package org.coinPet.bot.clients;

import org.coinPet.dto.puller.Assets;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

public interface CurrencyClient {
    @GetExchange("localhost:8080/currencies/{symbol}")
    Assets.Currency getCurrency(@PathVariable("symbol") String symbol);

    @GetExchange("localhost:8080/currency/stats/{symbol}")
    Assets getCurrencyStats(@PathVariable("symbol") String symbol);

}
