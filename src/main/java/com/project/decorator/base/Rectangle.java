package com.project.decorator.base;

/**
 * 第二步：实现具体业务
 *
 *@author: Weiyf
 *@Date: 2019-02-18 11:04
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape:Recatangle");
    }
}
