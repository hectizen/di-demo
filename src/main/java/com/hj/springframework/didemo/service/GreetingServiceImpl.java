package com.hj.springframework.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServiceImpl implements GreetingService {
    public static String HELLO = "Hello!!!!!!";
    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
