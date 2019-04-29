package com.hj.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static String HELLO = "Hello!!!!!!";
    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
