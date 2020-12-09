package com.project.factory.simple.function;

/**
 * 实现父类
 *
 *@author: Weiyf
 *@Date: 2019-02-13 11:15
 */
public class Bmw implements Car {
    @Override
    public void createCar() {
        System.out.println("宝马车");
    }
}
