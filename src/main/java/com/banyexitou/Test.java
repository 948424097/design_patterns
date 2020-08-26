package com.banyexitou;

import java.util.Arrays;
import java.util.List;

public class Test {

    public String t(){
        String path = getClass().getResource("/").getPath();
        return path;
    }
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.t());
        List<String> list = Arrays.asList("a","a");
    }
}
