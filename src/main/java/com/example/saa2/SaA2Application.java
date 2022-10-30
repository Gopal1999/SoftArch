package com.example.saa2;

import com.example.saa2.Entity.ItemResponse;
import com.example.saa2.Repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {ItemRepo.class, ItemResponseRepo.class, OptionRepo.class, SectionRepo.class, TestRepo.class, TestResponseRepo.class, UserRepo.class})
public class SaA2Application {

    public static void main(String[] args) {
        SpringApplication.run(SaA2Application.class, args);
    }

}
