package com.mobius.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration @ComponentScan(basePackages = "com.mobius.example")
public class TestModuleConfiguration {

    @Bean CentralizedConfiguration centralizedConfiguration() {
        return new CentralizedConfiguration(true);
    }
}
