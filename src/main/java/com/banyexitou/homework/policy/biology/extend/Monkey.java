package com.banyexitou.homework.policy.biology.extend;

import com.banyexitou.homework.policy.behavior.Behavior;
import com.banyexitou.homework.policy.behavior.impl.SlowRun;
import com.banyexitou.homework.policy.biology.Animal;

public class Monkey extends Animal {

    public Monkey(){
        behavior = new SlowRun();
    }

    public Monkey(Behavior behavior){
        this.behavior = behavior;
    }
}
