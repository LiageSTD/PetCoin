package org.coinpet.bot.service.telegramBot;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.coinpet.bot.configuration.ApplicationConfig;
import org.coinpet.bot.service.commandsHandler.CommandsHandlerService;
import org.coinpet.bot.service.commandsHandler.commands.CommandHandler;
import org.coinpet.dto.bot.UserNotificationDTO;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.longpolling.BotSession;
import org.telegram.telegrambots.longpolling.interfaces.LongPollingUpdateConsumer;
import org.telegram.telegrambots.longpolling.starter.AfterBotRegistration;
import org.telegram.telegrambots.longpolling.starter.SpringLongPollingBot;
import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.methods.commands.SetMyCommands;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramClient;

import java.util.List;
import java.util.Random;

@Component
//@Slf4j
public class TelegramBotService implements SpringLongPollingBot, LongPollingSingleThreadUpdateConsumer, TelegramBot {
    final CommandsHandlerService commandsHandlerService;
    final ApplicationConfig applicationConfig;
    final List<CommandHandler> commands;
    TelegramClient telegramClient;

    public TelegramBotService(CommandsHandlerService commandsHandlerService, ApplicationConfig applicationConfig, List<CommandHandler> commands) {
        this.commandsHandlerService = commandsHandlerService;
        this.applicationConfig = applicationConfig;
        this.commands = commands;
    }

    @Override
    public void consume(List<Update> updates) {
        LongPollingSingleThreadUpdateConsumer.super.consume(updates);
    }

    @Override
    public void consume(Update update) {
        try {
            telegramClient.execute(commandsHandlerService.handleMessage(update));
        } catch (TelegramApiException e) {
//            log.error("Unable to send message to: {}\n Error: {}", update.getMessage().getChatId(), e.getMessage());
        }
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
        telegramClient = new OkHttpTelegramClient(applicationConfig.getTelegramBotToken());
        setCommands();
    }

    @AfterBotRegistration
    public void afterRegistration(BotSession botSession) {
        System.out.println("Registered bot running state is: " + botSession.isRunning());
    }

    private void setCommands() {
        SetMyCommands setMyCommands = new SetMyCommands(commands.stream().map(
                command -> new BotCommand(command.command(), command.description())
        ).toList());

        try {
            telegramClient.execute(setMyCommands);
        } catch (TelegramApiException e) {
//            log.error("Unable to set commands: {}", e.getMessage());
        }
    }


    @Override
    public void notifyUser(UserNotificationDTO notificationDTO) {
        SendMessage sendMessage = new SendMessage(
                String.valueOf(notificationDTO.getUserTelegramID()),
                "There's an update for %s: now price is %s"
                        .formatted(
                                notificationDTO.getCoinNameToNotifyAbout(),
                                notificationDTO.getCurrentValue()
                        )
        );
        try {
            telegramClient.execute(sendMessage);
        } catch (TelegramApiException e) {
//            log.error(
//                    "Unable to send message with notification for user {} with text {}",
//                    sendMessage == null ? "sendMessage is null" : sendMessage.getChatId(),
//                    sendMessage == null ? "sendMessage is null" : sendMessage.getText()
//            );
        }
    }
}
