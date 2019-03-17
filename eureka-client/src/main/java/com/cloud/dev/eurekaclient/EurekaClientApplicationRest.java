package com.cloud.dev.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplicationRest {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplicationRest.class, args);
    }
}
