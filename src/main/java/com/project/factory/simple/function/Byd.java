package com.project.factory.simple.function;

/**
 * 实现具体行为
 *
 *@author: Weiyf
 *@Date: 2019-02-13 11:16
 */
public class Byd implements Car {
    @Override
    public void createCar() {
        System.out.println("比亚迪车");
    }
}
