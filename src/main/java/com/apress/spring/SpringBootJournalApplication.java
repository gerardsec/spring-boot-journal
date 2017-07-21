package com.apress.spring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.apress.spring.domain.Journal;
import com.apress.spring.repository.JournalRepository;

@SpringBootApplication
public class SpringBootJournalApplication {

    @Bean
    InitializingBean saveData(JournalRepository repo) {
        return () -> {
            repo.save(new Journal("Get to know Spring Boot", "Today I will learn Spring Boot", "2016/01/01"));
            repo.save(new Journal("Simple Spring Boot Project", "I will domy first Spring Boot Project", "2016/02/01"));
            repo.save(new Journal("Spring Boot Reading", "Read more about Spring Boot", "2016/03/01"));
            repo.save(new Journal("Spring Boot in the Cloud", "Spring Boot using Cloud Foundry", "2016/04/01"));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJournalApplication.class, args);
    }
}


