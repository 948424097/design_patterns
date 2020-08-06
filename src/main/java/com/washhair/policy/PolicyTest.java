package com.washhair.policy;

import com.washhair.policy.behavior.impl.FastRun;
import com.washhair.policy.biology.Animal;
import com.washhair.policy.biology.extend.Monkey;

public class PolicyTest {
    public static void main(String[] args) {
        /**
         * 对象初始化的时候属性值为空，容易出现空指针
         */
        Animal animal = new Monkey();
        animal.movement();
        animal.setBehavior(new FastRun());
        animal.movement();
    }
}
