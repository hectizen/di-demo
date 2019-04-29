package com.hj.springframework.didemo;

import com.hj.springframework.didemo.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController)ctx.getBean("myController");
        System.out.println(myController.hello());
    }

}
