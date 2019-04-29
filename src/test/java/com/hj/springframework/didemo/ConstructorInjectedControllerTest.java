package com.hj.springframework.didemo;

import com.hj.springframework.didemo.controller.ConstructorInjectedController;
import com.hj.springframework.didemo.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;
    @Before
    public void setUp(){
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void sayHello(){
        assertEquals(GreetingServiceImpl.HELLO, constructorInjectedController.sayHello());
        System.out.println(constructorInjectedController.sayHello());
    }
}
