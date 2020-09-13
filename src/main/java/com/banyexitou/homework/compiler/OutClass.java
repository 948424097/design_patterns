package com.banyexitou.homework.compiler;

public class OutClass {
    /**
     * 内部类的初始化真恶心
     */
    private  String outName;

    public OutClass(String outName) {
        this.outName = outName;
    }

    public  String show(){
        return outName;
    }

     class InnerClass{
        private String innerName;

        public void showOut(){
            System.out.println(show());

        }
    }




}
