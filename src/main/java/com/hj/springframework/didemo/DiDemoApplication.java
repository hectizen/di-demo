package com.hj.springframework.didemo;

import com.hj.springframework.didemo.controller.ConstructorInjectedController;
import com.hj.springframework.didemo.controller.MyController;
import com.hj.springframework.didemo.controller.PropertyInjectedController;
import com.hj.springframework.didemo.controller.SetterInjdectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController)ctx.getBean("myController");
        System.out.println(myController.hello());

        System.out.println("Property Injected : " + ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println("Setter Injected : " + ctx.getBean(SetterInjdectedController.class).sayHello());
        System.out.println("Constructor Injected : " + ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println("Primary Injected : " + ctx.getBean(MyController.class).sayHello());
    }

}
