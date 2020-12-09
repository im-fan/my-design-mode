package com.project.decorator;

import com.project.decorator.base.Shape;

/**
 * 第三步：创建实现了 Shape 接口的抽象装饰类。
 *
 *@author: Weiyf
 *@Date: 2019-02-18 11:06
 */
public abstract class AbsShapeDecorator implements Shape {

    protected Shape decoratorShape;

    public AbsShapeDecorator(Shape shape){
        this.decoratorShape = shape;
    }

    @Override
    public void draw(){
        decoratorShape.draw();
    }

}
