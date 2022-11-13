package com.example.saa2;

import com.example.saa2.Repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {TestRepo.class, TestResponseRepo.class,
 QuestionResponseRepo.class,UserRepo.class, NATRepo.class, TwoOptionMCQRepo.class, ThreeOptionMCQRepo.class, FourOptionRepoMCQ.class})
public class SaA2Application {

    public static void main(String[] args)
    {
        SpringApplication.run(SaA2Application.class, args);
    }

    @Bean
    public RestTemplate getTemplate()
    {
        return new RestTemplate();
    }
}
