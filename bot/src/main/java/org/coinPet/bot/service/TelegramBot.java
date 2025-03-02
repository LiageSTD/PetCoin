package org.coinPet.bot.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.coinPet.bot.configuration.ApplicationConfig;
import org.coinPet.bot.service.commandsHandler.CommandsHandlerService;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.longpolling.interfaces.LongPollingUpdateConsumer;
import org.telegram.telegrambots.longpolling.starter.SpringLongPollingBot;
import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.generics.TelegramClient;

import java.util.List;
@Component
@RequiredArgsConstructor
public class TelegramBot implements SpringLongPollingBot, LongPollingSingleThreadUpdateConsumer {
    CommandsHandlerService commandsHandlerService;
    ApplicationConfig applicationConfig;
    TelegramClient telegramClient;

    @Override
    public void consume(List<Update> updates) {
        LongPollingSingleThreadUpdateConsumer.super.consume(updates);
    }

    @Override
    public void consume(Update update) {
        commandsHandlerService.handleMessage(update);
    }

    @Override
    public String getBotToken() {
        return applicationConfig.getTelegramBotToken();
    }

    @Override
    public LongPollingUpdateConsumer getUpdatesConsumer() {
        return this;
    }
    @PostConstruct
    private void initTelegramClient() {
        telegramClient = new OkHttpTelegramClient(getBotToken());
    }
}
