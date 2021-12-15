package com.mab.core;

import com.mab.core.spring.di.ex2.SpringDIController;
import com.mab.core.spring.profile.GreetingController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(CoreApplication.class, args);

        //DI example
        SpringDIController controller = (SpringDIController) ctx.getBean("springDIController");
        log.info(controller.primaryGreeting());
        log.info(controller.englishGreeting());
        log.info(controller.spanishGreeting());

        //Profiles example
        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
        log.info(greetingController.greet());

        //Real world implementation:
        //Have several messaging communication or database technologies per env for example
        //Rabbit MQ, Kafka and SNS-SQS, H2, PostgreSQL, MySql
        // the implementation could be injected based on the environment and profile

        //Another implementation would be to use local docker images for testing purposes
        //when having a local or docker profile active (by yaml file)

        //Yet another real world usage would be mocking, SNS-SQS (and more AWS resources) locally with 'localstack'
        //based on a local or dev profile for the mocked or real resources.
    }
}
