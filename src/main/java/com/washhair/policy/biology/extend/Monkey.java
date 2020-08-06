package com.washhair.policy.biology.extend;

import com.washhair.policy.behavior.impl.SlowRun;
import com.washhair.policy.biology.Animal;

public class Monkey extends Animal {

    public Monkey(){
        behavior = new SlowRun();
    }
}
