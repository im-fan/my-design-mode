package com.project.observer;

import com.project.observer.ext.BinaryObserver;
import com.project.observer.ext.HexaObserver;
import com.project.observer.ext.OctalObserver;

/**
 * 观察者模式例子
 *
 *@author: Weiyf
 *@Date: 2019-02-25 09:29
 */
public class ObserverDemo {

    public static void main(String[] args){
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

}
