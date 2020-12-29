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

         //方式一
         buildByType();

         //方式二
         buildByClass();
     }

     public static void buildByType(){
         SimpleFactory simpleFactory = new SimpleFactory();
         simpleFactory.carFactory(SimpleFactory.BMW).createCar();
         simpleFactory.carFactory(SimpleFactory.BYD).createCar();
         simpleFactory.carFactory("五菱").createCar();
     }

     public static void buildByClass(){
         SimpleFactory simpleFactory = new SimpleFactory();
         simpleFactory.carFactory(Bmw.class).createCar();
         simpleFactory.carFactory(Byd.class).createCar();
         simpleFactory.carFactory(Object.class).createCar();
     }

}
