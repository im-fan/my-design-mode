package com.project.facade;

/**
 * 外观模式demo
 *
 *@author: Weiyf
 *@Date: 2019-02-22 11:55
 */
public class FacadeDemo {

    public static void main(String[] args){
        ShapeMark shapeMark = new ShapeMark();
        shapeMark.drawCirclAndSquare();
        shapeMark.drawSquareAndRectangle();
    }

}
