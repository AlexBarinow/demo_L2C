package com.love2code.demo.apps;

import com.love2code.demo.classes.TrackCoach;
import com.love2code.demo.interfaces.Coach;
import com.love2code.demo.interfaces.FortuneService;

public class myApp {

    public static void main(String[] args) {



        Coach baseBallCoach = new TrackCoach();

        System.out.println(baseBallCoach.getDailyWorkout());

    }
}
