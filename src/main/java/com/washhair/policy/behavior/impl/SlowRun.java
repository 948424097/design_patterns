package com.washhair.policy.behavior.impl;

import com.washhair.policy.behavior.Behavior;

public class SlowRun implements Behavior {
    public void move() {
        System.out.println("慢跑");
    }
}
