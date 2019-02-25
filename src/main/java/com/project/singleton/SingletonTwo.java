package com.project.singleton;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * DoubleCheckedLocking
 *
 *  多线程安全、延迟加载
 *@author: Weiyf
 *@Date: 2019-02-25 10:44
 */
public class SingletonTwo {

    private volatile static SingletonTwo singleton;

    private SingletonTwo (){}

    public static SingletonTwo getSingleton() {
        if (singleton == null) {
            synchronized (SingletonTwo.class) {
                if (singleton == null) {
                    singleton = new SingletonTwo();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args){
         SingletonTwo singletonTwo = SingletonTwo.getSingleton();
         for(int i=0; i<10; i++){
             Runnable runnable = () -> System.out.println("===>"+Thread.currentThread() + " ==> " + singletonTwo);
             runnable.run();
         }
    }

}
