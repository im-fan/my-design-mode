package com.project.facade.main;

/**
 * 实现业务
 *
 *@author: Weiyf
 *@Date: 2019-02-22 11:50
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw Rectangle ");
    }
}
