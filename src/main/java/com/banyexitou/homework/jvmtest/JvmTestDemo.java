package com.banyexitou.homework.jvmtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author b
 */
@RestController
public class JvmTestDemo {

    List<Banana> list = new ArrayList<>();



    @GetMapping("testHeap")
    public void testHeap(){
        while(true){
            list.add(new Banana());
        }
    }

    @GetMapping("testMethodArea")
    public void testMethodArea(){
        test1(1);
    }

    public static void test1(Integer i){
        System.out.println(i);
        i++;
        test1(i);
    }


}
