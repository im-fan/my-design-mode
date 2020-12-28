package com.project.singleton;

/**
 * 饿汉式
 * 没有加锁、执行效率高，容易产生垃圾对象
 * 立即加载
 *@author: Weiyf
 *@Date: 2019-02-25 10:43
 */
public class SingletonOne {

    private static SingletonOne instance = new SingletonOne();

    private SingletonOne (){}

    public static SingletonOne getInstance() {
        return instance;
    }

    public static void main(String[] args){
        for(int i=0; i<10; i++){
            Runnable runnable = () -> {
                SingletonOne singletonOne = SingletonOne.getInstance();
                System.out.println("===>"+Thread.currentThread() + " ==> " + singletonOne);
            };
            runnable.run();
        }
    }

}
