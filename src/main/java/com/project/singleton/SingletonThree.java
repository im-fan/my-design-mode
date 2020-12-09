package com.project.singleton;

/**
 * 登记式/静态内部类
 * 线程安全、延迟加载
 *@author: Weiyf
 *@Date: 2019-02-25 10:49
 */
public class SingletonThree {

    private static class SingletonHolder {
        private static final SingletonThree INSTANCE = new SingletonThree();
    }

    private SingletonThree (){}

    public static final SingletonThree getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args){
        final SingletonThree singletonThree = SingletonThree.getInstance();
        for(int i=0; i<10; i++){
            Runnable runnable = new Runnable() {
                public void run() {
                    System.out.println("===>" + Thread.currentThread() + " ==> " + singletonThree);
                }
            };
            runnable.run();
        }
    }

}
