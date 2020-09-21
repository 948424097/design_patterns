package com.banyexitou.homework.lambda;

public class SimpleJavaObject {
    private Integer num;
    private String name;

    public SimpleJavaObject(){
        /**
         * sb,double的值范围比Integer大，直接转啊
         */
        this.num = (int) (Math.random()*100);
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println((int)Math.random());
        }
    }

}
