package movie.premiere.integrations;

import movie.premiere.configuration.Configuration;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

import javax.inject.Inject;

public class TelegramBot extends TelegramWebhookBot {

    @Inject
    private Configuration configuration;

    @Override
    public BotApiMethod onWebhookUpdateReceived(Update update) {
        return null;
    }

    @Override
    public String getBotUsername() {
        return this.configuration.getBotUsername();
    }

    @Override
    public String getBotToken() {
        return this.configuration.getBotToken();
    }

    @Override
    public String getBotPath() {
        return this.configuration.getBotPath();
    }
}
