package org.coinpet.bot.service.commandsHandler.commands;

import lombok.AllArgsConstructor;
import org.coinpet.bot.service.subscriptionService.KafkaSubscriptionProducer;
import org.coinpet.dto.bot.IsToSubscribe;
import org.coinpet.dto.bot.NotificationType;
import org.coinpet.dto.bot.SubscriptionDTO;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class TrackHandler implements CommandHandler {
    KafkaSubscriptionProducer subscriptionProducer;
//    SimpleBotService ;

    @Override
    public String command() {
        return "/track";
    }

    @Override
    public String description() {
        return "Use this command to track coin's value.\nExample: /track <coin symbol> <threshold> <notification type (telegram : default, email)>";
    }

    @Override
    public SendMessage handle(Update update) {
        SendMessage reply;
        Long userTelegramID = update.getMessage().getChat().getId();
        SubscriptionDTO subscriptionDTO = new SubscriptionDTO();
        subscriptionDTO.setTelegramId(userTelegramID);

        String[] input = update.getMessage().getText().trim().split(" ");

        if (input.length == 3 || input.length == 4) {

            try {
                subscriptionDTO.setCurrencySymbol(input[1]);
                subscriptionDTO.setThreshold(BigDecimal.valueOf(Long.parseLong(input[2])));
                subscriptionDTO.setIsToSubscribe(IsToSubscribe.toSubscribe);
                if (input.length == 4) {
                    if (input[3].equals("telegram") || input[3].equals("email")) {
                        subscriptionDTO.setNotificationType(input[3].equals("telegram") ? NotificationType.telegram : NotificationType.email);
                    } else {
                        reply = new SendMessage(userTelegramID.toString(), "Invalid notification type. Please use telegram or email");
                    }
                } else {
                    subscriptionDTO.setNotificationType(NotificationType.telegram);
                }
                subscriptionProducer.send(subscriptionDTO);
//                botService.subscribeToCurrency(subscriptionDTO);
                reply = new SendMessage(userTelegramID.toString(), "You are now tracking " + input[1] + " with threshold " + input[2]);
//                log.info("User with id: {} is tracking {}", userTelegramID, input[1]);


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
