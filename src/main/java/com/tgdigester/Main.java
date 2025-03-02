package com.tgdigester;

import com.tgdigester.telegram.TelegramService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication
public class Main {
    public static void main(String[] args) {
//        SpringApplication.run(Main.class, args);
        System.out.println("Приложение запущено!");
    }

//    @Bean
//    CommandLineRunner run(ApplicationContext ctx) {
//        return args -> {
//            TelegramService telegramService = ctx.getBean(TelegramService.class);
//            telegramService.connect();
//        };
//    }
}
