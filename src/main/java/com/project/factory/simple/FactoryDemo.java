package com.project.factory.simple;

import com.project.factory.simple.function.Car;
import com.project.factory.simple.function.Bmw;
import com.project.factory.simple.function.Byd;

/**
 * 工厂模式示例
 *
 *@author: Weiyf
 *@Date: 2019-02-13 11:26
 */
public class FactoryDemo {

     public static void main(String[] args){
        SimpleFactory simpleFactory = new SimpleFactory();

        simpleFactory.carFactory("bmw").createCar();
        simpleFactory.carFactory("byd").createCar();
        simpleFactory.carFactory("wuling").createCar();

        simpleFactory.carFactory(Bmw.class).createCar();
        simpleFactory.carFactory(Byd.class).createCar();
        simpleFactory.carFactory(Car.class).createCar();
     }

}
