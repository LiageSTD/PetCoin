package org.coinpet.petcoin.crypto.service.cryptoService;


import org.coinpet.dto.puller.Assets;

public interface Crypto {
    Assets.Currency getCurrencyInfoBySymbol(String symbol);

    Assets getCurrencyStatsBySymbol(String symbol);

}
