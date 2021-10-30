package com.love2code.demo.classes;

import com.love2code.demo.interfaces.FortuneService;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

}
