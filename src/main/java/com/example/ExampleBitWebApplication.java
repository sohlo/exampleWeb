package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example")
@PropertySource({"classpath:application.properties"})
public class ExampleBitWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleBitWebApplication.class, args);
    }
}

