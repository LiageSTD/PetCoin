package org.coinpet.petcoin.crypto.service.cryptoService;

import lombok.RequiredArgsConstructor;
import org.coinpet.petcoin.crypto.clients.CoinCap.dto.Assets;
import org.coinpet.petcoin.repository.CoinRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CryptoService implements Crypto {
    CoinRepository coinRepository;

    @Override
    public Assets.Currency getCurrencyInfoBySymbol(String symbol) {
        return coinRepository.findCurrencyBySymbol(symbol);
    }

    @Override
    public Assets getCurrencyStatsBySymbol(String symbol) {
        return coinRepository.getCurrencyStatsBySymbol(symbol);
    }
}
