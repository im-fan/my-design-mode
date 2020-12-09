package com.project.facade.main;

/**
 * 实现业务
 *
 *@author: Weiyf
 *@Date: 2019-02-22 11:49
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw Circle");
    }
}
