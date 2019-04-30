package com.hj.springframework.didemo.controller;

import com.hj.springframework.didemo.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello !!!");
        return "Fooooooo.";
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
