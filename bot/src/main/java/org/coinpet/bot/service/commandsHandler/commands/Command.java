package org.coinpet.bot.service.commandsHandler.commands;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;

public interface Command {

    String command();

    String description();

    SendMessage handle(Update update);

    default boolean supports(Update update) {
        return update.getMessage().getText().trim().startsWith(command());
    }

    default BotCommand toApiCommand() {
        return new BotCommand(command(), description());
    }
}
