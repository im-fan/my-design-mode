package com.project.factory.abs;

/**
 * 抽象工厂示例
 *
 *@author: Weiyf
 *@Date: 2019-02-13 15:34
 */
public class AbstractFactoryDemo {

    public static void main(String[] args){
         AbsBmwFactory bmwFactory = new AbsBmwFactory();
         bmwFactory.carFactory().carFactory().createCar();
         bmwFactory.createAirCondition().makeAirCondition();

         AbsBydFactory bydFactory = new AbsBydFactory();
         bydFactory.carFactory().carFactory().createCar();
         bydFactory.createAirCondition().makeAirCondition();
    }

}
