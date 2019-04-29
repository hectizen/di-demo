package com.hj.springframework.didemo;

import com.hj.springframework.didemo.controller.PropertyInjectedController;
import com.hj.springframework.didemo.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp(){
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void sayHello(){
        assertEquals(GreetingServiceImpl.HELLO, this.propertyInjectedController.sayHello());
        System.out.println(this.propertyInjectedController.sayHello());
    }
}
