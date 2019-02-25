package com.project.facade;

import com.project.facade.main.Circle;
import com.project.facade.main.Rectangle;
import com.project.facade.main.Square;

public class ShapeMark {

    private Circle circle;
    private Rectangle rectangle;
    private Square square;

    public ShapeMark(){
        if(circle == null){
            circle = new Circle();
        }
        if(rectangle == null){
            rectangle = new Rectangle();
        }

        if(square == null){
            square = new Square();
        }
    }

    public void drawCirclAndSquare(){
        circle.draw();
        square.draw();
        System.out.println("circle and square is painting over");
    }

    public void drawSquareAndRectangle(){
        square.draw();
        rectangle.draw();
        System.out.println("square and rectangle is painting over");
    }

}
