package com.mobius.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration @ComponentScan(basePackages = "com.mobius.example.services")
public class ApplicationConfiguration {

    @Bean public CentralizedConfiguration centralizedConfiguration() {
        return new CentralizedConfiguration(true);
    }
}
