package com.banyexitou.homework.policy.biology;

import com.banyexitou.homework.policy.behavior.Behavior;

public abstract class Animal {

    public Behavior behavior;

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void movement() {
        behavior.move();
    }
}
