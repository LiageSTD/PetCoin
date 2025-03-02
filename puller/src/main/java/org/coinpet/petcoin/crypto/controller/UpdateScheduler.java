package org.coinpet.petcoin.crypto.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.coinpet.petcoin.crypto.service.currencyUpdater.CurrencyUpdaterService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
@ConditionalOnProperty(name = "app.scheduler.enabled", havingValue = "true", matchIfMissing = true)
public class UpdateScheduler {
    private final CurrencyUpdaterService currencyUpdaterService;

    @Scheduled(fixedDelayString = "#{@scheduler.interval().toMillis()}")
    public void update() {
        log.info("Starting scheduled currency update");
        currencyUpdaterService.updateAllAvailableCurrencies();
        log.info("Scheduled currency update finished");
    }
}
