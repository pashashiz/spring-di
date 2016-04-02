package com.mobius.example;

import com.mobius.example.services.SimpleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        SimpleService service = ctx.getBean(SimpleService.class);
        System.out.println(service.doWork());
    }

}
