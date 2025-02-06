package org.coinpet.petcoin.crypto.clients.CoinCap;

import org.coinpet.petcoin.crypto.clients.CoinCap.dto.Assets;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

public interface CoinCapClient {
    @GetExchange("https://api.coincap.io/v2/assets")
    Assets getAvailableCurrencies();

    @GetExchange("https://api.coincap.io/v2/assets/{coinName}")
    Assets.Currency getSpecificAsset(
            @PathVariable("coinName") String coinName
    );

}
