package com.washhair.observe.observer;

import com.washhair.observe.observable.Observable;

public abstract class Observer {

    Observable observable;

    public Observer(Observable observable){
        this.observable = observable;
    }

    public void registerObserver(Observer observer){
        observable.addObserver(observer);
    };

    public void removeObserver(Observer observer){
        observable.removeObserver(observer);
    }
}
