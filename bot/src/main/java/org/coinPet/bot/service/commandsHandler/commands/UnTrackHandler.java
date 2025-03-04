package org.coinPet.bot.service.commandsHandler.commands;

import lombok.RequiredArgsConstructor;
import org.coinPet.bot.clients.UserClient;
import org.coinPet.dto.bot.SubscriptionDTO;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
@RequiredArgsConstructor
public class UnTrackHandler implements CommandHandler {
    UserClient userClient;

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
        userClient.unSubscribeUser(new SubscriptionDTO(userTelegramID, messageWords[1], null, ""));
        return new SendMessage(String.valueOf(userTelegramID), "Untracking " + messageWords[1] + " now...");
    }
}
