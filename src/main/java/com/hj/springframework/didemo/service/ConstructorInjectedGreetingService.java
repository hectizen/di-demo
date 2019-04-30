package com.hj.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    public static String HELLO = "Hello!!!!!!, Constructor";
    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
