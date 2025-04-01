package org.coinpet.petcoin.crypto.clients.coincap;

import org.coinpet.dto.puller.Assets;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

public interface CoinCapClient {
//    @GetExchange("https://api.coincap.io/v2/assets")
    @GetExchange("assets")
    Assets getAvailableCurrencies(@RequestParam(value = "limit", defaultValue = "2000") int limit);

//    @GetExchange("https://api.coincap.io/v2/assets/{coinName}")
    @GetExchange("assets/{coinName}")
    Assets.Currency getSpecificAsset(@PathVariable("coinName") String coinName);

}
