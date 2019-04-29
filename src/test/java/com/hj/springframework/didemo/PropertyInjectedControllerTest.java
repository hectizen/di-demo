package com.hj.springframework.didemo;

import com.hj.springframework.didemo.controller.PropertyInjectedController;
import com.hj.springframework.didemo.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp(){
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void sayHello(){
        System.out.println(this.propertyInjectedController.sayHello());
    }
}
