package org.coinpet.bot.service.commandsHandler.commands;

import lombok.AllArgsConstructor;
import org.coinpet.bot.clients.CurrencyClient;
import org.coinpet.dto.bot.SubscriptionDTO;
import org.coinpet.dto.puller.Assets;
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
        return "Use this command to see info about a coin.\nExample: /stat BTC";
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
                reply = new SendMessage(String.valueOf(userTelegramID), prettyPrint(currencyToDisplay));
            } else {
                reply = new SendMessage(String.valueOf(userTelegramID), "Currency not found");
            }
        } else {
            reply = new SendMessage(String.valueOf(userTelegramID), "Invalid input. Please use /stat <currency>");
        }

        return reply;
    }
    private String prettyPrint(Assets.Currency currency) {
        return "Currency: " + currency.getName() + "\n" +
            "Symbol: " + currency.getSymbol() + "\n" +
            "Price: " + currency.getPriceUSD() + "\n" +
            "Market Cap: " + currency.getMarketCapUsd() + "\n" +
            "Volume 24H: " + currency.getVolumeUsd24Hr() + "\n";
    }
}
