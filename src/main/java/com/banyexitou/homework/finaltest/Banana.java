package com.banyexitou.homework.finaltest;

import lombok.ToString;

@ToString
public class Banana {
    Integer weight = 0;
    int count = 0;
    String name = "app";

    public Banana(){

    }

     public Banana(Integer weight, int count, String name) {
          this.weight = weight;
          this.count = count;
          this.name = name;
     }



     public static void main(String[] args) {
          final Banana banana = new Banana(1,1,"a");


          //banana = new Banana(); 会报错
          System.out.println(banana);
          banana.count = 2;
          System.out.println(banana);
          new Integer(1);
     }
}
