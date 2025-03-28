package org.coinpet.bot.service.commandsHandler.commands;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

@Service
@AllArgsConstructor
public class HelpHandler implements Command {
    private final List<CommandHandler> availableCommands;

    @Override
    public String command() {
        return "/help";
    }

    @Override
    public String description() {
        return "Use this command to see all available commands\nExample: /help";
    }

    @Override
    public SendMessage handle(Update update) {
        StringBuilder replyText = new StringBuilder("Available commands:\n");
        for (CommandHandler commandHandler : availableCommands) {
            replyText.append("---\n");
            replyText.append(commandHandler.command()).append(" - ").append(commandHandler.description()).append("\n");
        }
        return new SendMessage(
                update.getMessage().getChat().getId().toString(),
                replyText.toString()
        );
    }
}
