package com.hj.springframework.didemo;

import com.hj.springframework.didemo.controller.SetterInjdectedController;
import com.hj.springframework.didemo.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjetedControllerTest {
    private SetterInjdectedController setterInjdectedController;

    @Before
    public void setUp(){
        this.setterInjdectedController = new SetterInjdectedController();
        this.setterInjdectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void sayHello(){
        assertEquals(GreetingServiceImpl.HELLO, this.setterInjdectedController.sayHello());
        System.out.println(this.setterInjdectedController.sayHello());
    }
}
