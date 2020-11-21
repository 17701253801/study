package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public String getName() {
        String name = "suntong";
        if (name.equals("java")) {
            return name;
        }
        switch (name) {
        case "java":
            return "1";
        default:
            break;
        }
        return "ssasas";
    }

}
