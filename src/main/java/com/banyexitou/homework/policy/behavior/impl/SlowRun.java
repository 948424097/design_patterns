package com.banyexitou.homework.policy.behavior.impl;

import com.banyexitou.homework.policy.behavior.Behavior;

public class SlowRun implements Behavior {
    public void move() {
        System.out.println("慢跑");
    }
}
