package com.project.decorator;

import com.project.decorator.base.Shape;

/**
 * 第四步 创建扩展了 ShapeDecorator 类的实体装饰类。
 *
 *@author: Weiyf
 *@Date: 2019-02-18 11:11
 */
public class RedShapeDecorator extends AbsShapeDecorator {


    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw(){
        decoratorShape.draw();
        setRedBorder();
    }

    /** 扩展父类功能 **/
    private void setRedBorder(){
        System.out.println("Border Color:red");
    }

}
