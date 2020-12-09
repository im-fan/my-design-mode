package com.project.observer;

/**
 * 创建观察者对象
 *
 *@author: Weiyf
 *@Date: 2019-02-22 18:06
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();

}
