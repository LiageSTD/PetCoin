package org.coinpet.petcoin.crypto.controller.rest;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.coinpet.dto.puller.Assets;
import org.coinpet.petcoin.crypto.service.cryptoService.CryptoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/crypto/v1")
@AllArgsConstructor
public class CryptoController {
    private CryptoService cryptoService;

    @GetMapping("/currency/{symbol}")
    public Assets.Currency getCurrencyInfo(@PathVariable("symbol") String symbol) {
        return cryptoService.getCurrencyInfoBySymbol(symbol);
    }

    @GetMapping("/currency/stats/{symbol}")
    public Assets getCurrencyStats(@PathVariable("symbol") String symbol) {
        return cryptoService.getCurrencyStatsBySymbol(symbol);
    }
}
