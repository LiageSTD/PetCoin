package org.coinPet.bot.service.commandsHandler.commands;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.coinPet.bot.clients.CurrencyClient;
import org.coinPet.dto.bot.SubscriptionDTO;
import org.coinPet.dto.puller.Assets;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
@Service
@AllArgsConstructor
public class StatHandler implements CommandHandler {
    CurrencyClient currencyClient;
    @Override
    public String command() {
        return "/stat";
    }

    @Override
    public String description() {
        return "Use this command to see info about a coin. \n Example: /stat BTC";
    }

    @Override
    public SendMessage handle(Update update) {
        SendMessage reply;
        Long userTelegramID = update.getMessage().getChat().getId();
        SubscriptionDTO subscriptionDTO = new SubscriptionDTO();

        String[] input = update.getMessage().getText().trim().split(" ");
        if (input.length == 2) {
            Assets.Currency currencyToDisplay = currencyClient.getCurrency(input[1]);
            if (currencyToDisplay != null) {
                reply = new SendMessage(String.valueOf(userTelegramID), currencyToDisplay.toString());
            } else {
                reply = new SendMessage(String.valueOf(userTelegramID), "Currency not found");
            }
        } else {
            reply = new SendMessage(String.valueOf(userTelegramID), "Invalid input. Please use /stat <currency>");
        }

        return reply;
    }
}
