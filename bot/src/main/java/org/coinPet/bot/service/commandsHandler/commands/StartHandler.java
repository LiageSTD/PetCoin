package org.coinPet.bot.service.commandsHandler.commands;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.coinPet.bot.service.botService.BotService;
import org.coinPet.dto.bot.UserDTO;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
@RequiredArgsConstructor
@Slf4j
public class StartHandler implements Command {
    BotService botService;

    @Override
    public String command() {
        return "/start";
    }

    @Override
    public String description() {
        return "A command to register you in the system";
    }

    @Override
    public SendMessage handle(Update update) {
        SendMessage reply;
        Long userTelegramID = update.getMessage().getChat().getId();

        if (botService.isCharRegistered(userTelegramID)) {
            reply = new SendMessage(String.valueOf(userTelegramID), "Hi, nice to meet you again");
        } else {
            botService.registerUser(new UserDTO(userTelegramID, update.getMessage().getChat().getUserName(), ""));
            log.info("User with id: {} was registered", userTelegramID);
            reply = new SendMessage(String.valueOf(userTelegramID), "Hi! Use /help to see what i can!");
        }
        return reply;
    }
}
