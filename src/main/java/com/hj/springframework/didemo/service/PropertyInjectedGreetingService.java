package com.hj.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {
    public static String HELLO = "Hello!!!!!!, Property";
    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
