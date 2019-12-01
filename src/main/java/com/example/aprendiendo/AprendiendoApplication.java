package com.example.aprendiendo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AprendiendoApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(AprendiendoApplication.class, args);
    }

    @Bean
    public InterfaceService getService(){
        return new DefaultService();
    }

    @Override
    public void run(String... args) throws Exception {
        getService().Saludo();
    }

}
