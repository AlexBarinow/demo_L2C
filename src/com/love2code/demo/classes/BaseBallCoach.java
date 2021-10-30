package com.love2code.demo.classes;

import com.love2code.demo.interfaces.Coach;

public class BaseBallCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "spend 30 mins on batting procedure";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
