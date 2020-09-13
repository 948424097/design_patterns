package com.banyexitou.homework.observe.observable;


import java.util.ArrayList;
import java.util.Observer;`

/**
 * 被观察的
 */
public abstract class Observable {

    ArrayList list;

    public Observable(){
        list = new ArrayList();
    }

    public void addObserver(Observer observer){
        list.add(observer);
    }

    public void removeObserver(Observer observer){
        if(list.contains(observer)){
            list.remove(list);
        }
    }
}
