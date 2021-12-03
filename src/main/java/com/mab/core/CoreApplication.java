package com.mab.core;

import com.mab.core.spring.di.ex2.SpringDIController;
import com.mab.core.spring.profile.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(CoreApplication.class, args);

        //DI example
        SpringDIController controller = (SpringDIController) ctx.getBean("springDIController");
        System.out.println(controller.primaryGreeting());
        System.out.println(controller.englishGreeting());
        System.out.println(controller.spanishGreeting());

        //Profiles example
        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
        System.out.println(greetingController.greet());

        //Real world implementation:
        //Have several messaging communication or database technologies per env for example
        //Rabbit MQ, Kafka and SNS-SQS, H2, PostgreSQL, MySql
        // the implementation could be injected based on the environment and profile
    }

}
