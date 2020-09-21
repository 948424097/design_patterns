package com.banyexitou.homework.another;

import org.springframework.context.annotation.DependsOn;

/**
 * DependsOn是不会让当前的被标识的类被ioc容器托管的
 */
//@Component
@DependsOn("Applll")
public class Treeeee {

    public static void main(String[] args) {
        Treeeee treeeee = new Treeeee();
        treeeee.test();
    }

    private void test() {
    }


}
