package com.project.bridge;

import com.project.bridge.main.GreenCircle;
import com.project.bridge.main.RedCircle;
import com.project.bridge.main.Shape;

/**
 * 桥接模式demo
 *
 *@author: Weiyf
 *@Date: 2019-02-22 16:49
 */
public class BridgeDemo {

    public static void main(String[] args){
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
