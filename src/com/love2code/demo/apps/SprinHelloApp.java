package com.love2code.demo.apps;

import com.love2code.demo.interfaces.Coach;
import com.love2code.demo.interfaces.FortuneService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SprinHelloApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());


        FortuneService fortuneService = context.getBean("myFortune", FortuneService.class);

        System.out.println(fortuneService.getFortune());

        context.close();
    }
}
