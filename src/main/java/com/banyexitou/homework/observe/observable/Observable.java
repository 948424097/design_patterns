package com.banyexitou.homework.observe.observable;

import com.banyexitou.homework.observe.observer.Observer;

import java.util.ArrayList;

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
