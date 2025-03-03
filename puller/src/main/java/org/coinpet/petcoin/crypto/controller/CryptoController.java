package org.coinpet.petcoin.crypto.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.coinPet.dto.puller.Assets;
import org.coinpet.petcoin.crypto.service.cryptoService.CryptoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/crypto/v1")
@RequiredArgsConstructor
public class CryptoController {
    private CryptoService cryptoService;

    @GetMapping("/currency/{symbol}")
    Assets.Currency getCurrencyInfo(@PathVariable String symbol) {
        return cryptoService.getCurrencyInfoBySymbol(symbol);
    }

    @GetMapping("/currency/stats/{symbol}")
    Assets getCurrencyStats(@PathVariable String symbol) {
        return cryptoService.getCurrencyStatsBySymbol(symbol);
    }
}
