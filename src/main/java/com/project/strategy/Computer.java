package com.project.strategy;

/**
 * 策略模式
 * 定义一个接口，子类实现具体业务，
 * 通过context类在方法运行时确定具体执行那个子类的方法
 *
 *@author: Weiyf
 *@Date: 2019-02-12 17:23
 */
public interface Computer {

    int doOperation(int a,int b);

}
