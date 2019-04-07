package com.an80x86.whitelabelhosting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WhitelabelhostingApplication {
    public static void main(String[] args) {

        SpringApplication.run(WhitelabelhostingApplication.class, args);
    }
}
