package com.project.bridge.main;

/**
 * 实现业务
 *
 *@author: Weiyf
 *@Date: 2019-02-22 16:14
 */
public class GreenCircle implements DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
