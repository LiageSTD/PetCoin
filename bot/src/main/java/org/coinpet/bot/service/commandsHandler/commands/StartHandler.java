package org.coinpet.bot.service.commandsHandler.commands;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.coinpet.bot.clients.UserClient;
import org.coinpet.bot.service.botService.BotService;
import org.coinpet.dto.bot.UserDTO;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
@AllArgsConstructor
//@Slf4j
public class StartHandler implements CommandHandler {

    private final UserClient botService;

    @Override
    public String command() {
        return "/start";
    }

    @Override
    public String description() {
        return "A command to register you in the system\nExample: /start";
    }

    @Override
    public SendMessage handle(Update update) {
        SendMessage reply;
        Long userTelegramID = update.getMessage().getChat().getId();

        if (botService.checkIfUserIsRegistered(userTelegramID)) {
            reply = new SendMessage(String.valueOf(userTelegramID), "Hi, nice to meet you again");
        } else {
            botService.registerUser(new UserDTO(userTelegramID, update.getMessage().getChat().getUserName(), ""));
//            log.info("User with id: {} was registered", userTelegramID);
            reply = new SendMessage(String.valueOf(userTelegramID), "Hi! Use /help to see what i can!");
        }
        return reply;
    }
}
