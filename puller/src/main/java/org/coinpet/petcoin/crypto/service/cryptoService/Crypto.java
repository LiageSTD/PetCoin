package org.coinpet.petcoin.crypto.service.cryptoService;


import org.coinPet.dto.puller.Assets;

public interface Crypto {
    Assets.Currency getCurrencyInfoBySymbol(String symbol);

    Assets getCurrencyStatsBySymbol(String symbol);

}
