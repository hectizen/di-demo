package com.hj.springframework.didemo.controller;

import com.hj.springframework.didemo.service.GreetingService;

public class SetterInjdectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
