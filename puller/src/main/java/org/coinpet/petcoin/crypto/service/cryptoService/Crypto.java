package org.coinpet.petcoin.crypto.service.cryptoService;

import org.coinpet.petcoin.crypto.clients.CoinCap.dto.Assets;

public interface Crypto {
    Assets.Currency getCurrencyInfoBySymbol(String symbol);

    Assets getCurrencyStatsBySymbol(String symbol);

}
