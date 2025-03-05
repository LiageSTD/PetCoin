package org.coinpet.bot.service.commandsHandler.commands;

import lombok.AllArgsConstructor;
import org.coinpet.bot.clients.UserClient;
import org.coinpet.dto.bot.SubscriptionDTO;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

@Service
@AllArgsConstructor
public class SubscriptionsHandler implements CommandHandler {
    UserClient userClient;
    @Override
    public String command() {
        return "/subscriptions";
    }

    @Override
    public String description() {
        return "Use this command to see yor subscriptions\nExample: /subscriptions";
    }

    @Override
    public SendMessage handle(Update update) {
        Long userTelegramID = update.getMessage().getChat().getId();
        List<SubscriptionDTO> subscriptions = userClient.getUserSubscriptions(userTelegramID);
        return new SendMessage(String.valueOf(userTelegramID), subscriptions.isEmpty() ? "Nothing to show" : subscriptions.toString());
    }
}
