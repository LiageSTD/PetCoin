package org.coinPet.bot.service.commandsHandler.commands;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.coinPet.bot.clients.UserClient;
import org.coinPet.dto.bot.SubscriptionDTO;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
@Slf4j
public class TrackHandler implements CommandHandler {

    UserClient userClient;

    @Override
    public String command() {
        return "/track";
    }

    @Override
    public String description() {
        return "Use this command to track coin's value. \n/track <coin symbol> <threshold> <notification type (telegram : default, email)>";
    }

    @Override
    public SendMessage handle(Update update) {
        SendMessage reply;
        Long userTelegramID = update.getMessage().getChat().getId();
        SubscriptionDTO subscriptionDTO = new SubscriptionDTO();
        subscriptionDTO.setTelegramId(userTelegramID);

        String[] input = update.getMessage().getText().trim().split(" ");

        if (input.length == 3 || input.length == 4) {
            reply = new SendMessage(String.valueOf(userTelegramID), "Tracking " + input[1] + " now...");

            try {
                subscriptionDTO.setCurrencySymbol(input[1]);
                subscriptionDTO.setThreshold(BigDecimal.valueOf(Long.parseLong(input[2])));
                if (input.length == 4) {
                    if (input[3].equals("telegram") || input[3].equals("email")) {
                        subscriptionDTO.setNotificationType(input[3]);
                    } else {
                        reply = new SendMessage(userTelegramID.toString(), "Invalid notification type. Please use telegram or email");
                    }
                } else {
                    subscriptionDTO.setNotificationType("telegram");
                }
                userClient.subscribeUser(subscriptionDTO);
                log.info("User with id: {} is tracking {}", userTelegramID, input[1]);


            } catch (NumberFormatException e) {
                reply = makeReplyWithInvalidInput(userTelegramID);
            }

        } else {
            reply = makeReplyWithInvalidInput(userTelegramID);
        }

        return reply;
    }

    private SendMessage makeReplyWithInvalidInput(Long telegramID) {
        return new SendMessage(telegramID.toString(), "Invalid input. Please use /track <coin symbol> <threshold> <notification type (telegram : default, email)>");
    }

}
