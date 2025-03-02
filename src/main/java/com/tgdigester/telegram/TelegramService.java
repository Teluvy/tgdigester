package com.tgdigester.telegram;

import com.tgdigester.telegram.config.TelegramConfig;
import org.springframework.stereotype.Service;

@Service
public class TelegramService {

    private final TelegramConfig config;

    public TelegramService(TelegramConfig config) {
        this.config = config;
    }

    public void connect() {
        System.out.println("Connecting to Telegram with:");
        System.out.println("API ID: " + config.getApiId());
        System.out.println("API Hash: " + config.getApiHash());
        System.out.println("Phone: " + config.getPhoneNumber());
        // TODO: Здесь будет логика подключения к Telegram API
    }


}
