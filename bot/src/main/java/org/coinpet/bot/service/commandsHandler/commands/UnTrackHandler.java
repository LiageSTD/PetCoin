package org.coinpet.bot.service.commandsHandler.commands;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.coinpet.bot.clients.UserClient;
import org.coinpet.bot.service.botService.SimpleBotService;
import org.coinpet.dto.bot.IsToSubscribe;
import org.coinpet.dto.bot.NotificationType;
import org.coinpet.dto.bot.SubscriptionDTO;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
@AllArgsConstructor
public class UnTrackHandler implements CommandHandler {
    UserClient botService;

    @Override
    public String command() {
        return "/untrack";
    }

    @Override
    public String description() {
        return "Use this command to stop tracking coin's value.\nExample: /untrack BTC";
    }

    @Override
    public SendMessage handle(Update update) {
        Long userTelegramID = update.getMessage().getChat().getId();
        String[] messageWords = update.getMessage().getText().split(" ");
        if (messageWords.length != 2) {
            return new SendMessage(String.valueOf(userTelegramID), "Invalid input. Please use /untrack <currency>");
        }
        SubscriptionDTO subscriptionDTO = new SubscriptionDTO();
        subscriptionDTO.setIsToSubscribe(IsToSubscribe.toUnsubscribe);
        subscriptionDTO.setCurrencySymbol(messageWords[1]);
        subscriptionDTO.setTelegramId(userTelegramID);

        return new SendMessage(String.valueOf(userTelegramID), "Untracking " + messageWords[1] + " now...");
    }
}
