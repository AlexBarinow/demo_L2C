package com.love2code.demo.classes;

import com.love2code.demo.interfaces.Coach;
import com.love2code.demo.interfaces.FortuneService;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "OK, now go to a Track for some time";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}