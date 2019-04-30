package com.hj.springframework.didemo.controller;

import com.hj.springframework.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjdectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(@Qualifier("setterInjectedGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
