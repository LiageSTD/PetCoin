package org.coinPet.bot.service.commandsHandler.commands;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StartHandler implements Command {

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
        SendMessage reply = new SendMessage();
        Long id = update.getMessage().getChat().getId();
        reply.setChatId(String.valueOf(id));
        if (botService.isChatRegistered(id)) {
            reply.setText("Hi, nice to meet you again");
        } else {
            botService.registerChat(id);
            reply.setText("Hi! Use /help to see what i can!");
        }
        return reply;
    }
}
