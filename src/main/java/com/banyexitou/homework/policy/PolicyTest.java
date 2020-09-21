package com.banyexitou.homework.policy;

import com.banyexitou.homework.policy.behavior.impl.FastRun;
import com.banyexitou.homework.policy.biology.Animal;
import com.banyexitou.homework.policy.biology.extend.Monkey;
import org.springframework.beans.factory.support.AbstractBeanFactory;

public class PolicyTest {
    public static void main(String[] args) {

        /**
         * 对象初始化的时候属性值为空，容易出现空指针
         */
        Animal animal = new Monkey();
        animal.movement();
        animal.setBehavior(new FastRun());
        animal.movement();
        System.out.println("resolvedName" != null);

        while ("resolvedName" != null);
    }
}
