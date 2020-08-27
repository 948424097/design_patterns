package com.banyexitou.homework.finaltest;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FinalTestDemo {


    /**
     * 内部类不能有静态代码块
     * @param args
     * @throws Exception
     */
    public static void main (String[] args)throws Exception {
        Apple apple = new Apple();
        System.out.println(apple);

//        List<String> list = Arrays.asList("name");
        List<String> list = Arrays.asList("count","weight");
        Class aClass = apple.getClass();
        for(String str:list){
            Field declaredField = aClass.getDeclaredField(str);
            declaredField.setAccessible(true);
            if(Objects.nonNull(declaredField)){
                System.out.println("before "+str+" : "+declaredField.get(apple));
                declaredField.set(apple,666);
                System.out.println("after "+str+" : "+declaredField.get(apple));
            }
        }
        System.out.println(apple);
    }

}
