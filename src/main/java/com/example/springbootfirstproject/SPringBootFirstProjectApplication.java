package com.example.springbootfirstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SPringBootFirstProjectApplication {
//commento aggiunto per verificare la compatibilità e aggiornamento delle modifiche al progetto tra github e gitlab
    public static void main(String[] args) {
        SpringApplication.run(SPringBootFirstProjectApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
