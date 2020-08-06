package com.washhair.policy.biology;

import com.washhair.policy.behavior.Behavior;

public abstract class Animal {

    public Behavior behavior;


    public Behavior getBehavior() {
        return behavior;
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void movement() {
        behavior.move();
    }
}
