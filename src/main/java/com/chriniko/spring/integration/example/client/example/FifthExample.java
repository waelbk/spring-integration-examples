package com.chriniko.spring.integration.example.client.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FifthExample implements Example {

    @Override
    public void run() {

        new ClassPathXmlApplicationContext("config-integration-example-5.xml");

    }
}
