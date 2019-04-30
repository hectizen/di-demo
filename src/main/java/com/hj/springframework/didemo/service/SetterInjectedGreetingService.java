package com.hj.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    public static String HELLO = "Hello!!!!!!, Setter";
    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
