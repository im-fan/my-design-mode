package com.project.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建被观察类
 *
 *@author: Weiyf
 *@Date: 2019-02-22 18:05
 */
public class Subject {

    /** 需要通知的观察者集合 **/
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
