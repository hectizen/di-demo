package com.hj.springframework.didemo.controller;

import com.hj.springframework.didemo.service.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
