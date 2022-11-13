package com.example.responsemanagementservicde;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ResponseManagementServicdeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResponseManagementServicdeApplication.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

}
