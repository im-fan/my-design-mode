package com.project.decorator;

import com.project.decorator.base.Circle;
import com.project.decorator.base.Rectangle;
import com.project.decorator.base.Shape;

/**
 * 装饰者模式demo
 *
 *@author: Weiyf
 *@Date: 2019-02-18 11:15
 */
public class DecoratorDemo {

    public static void main(String[] args){
        Shape circle = new Circle();
        Shape redCicle = new RedShapeDecorator(circle);
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("======>");
        circle.draw();
        System.out.println("======>");
        redRectangle.draw();
        System.out.println("======>");
        redCicle.draw();
    }


}
