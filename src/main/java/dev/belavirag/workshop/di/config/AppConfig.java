package dev.belavirag.workshop.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan("dev.belavirag.workshop.di")
public class AppConfig {
    @Bean
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
}
