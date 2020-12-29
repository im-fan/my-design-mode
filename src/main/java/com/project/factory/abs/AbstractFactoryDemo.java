package com.project.factory.abs;

import com.project.factory.abs.car.AbsBmwFactory;
import com.project.factory.abs.car.AbsBydFactory;

/**
 * 抽象工厂示例
 *
 *@author: Weiyf
 *@Date: 2019-02-13 15:34
 */
public class AbstractFactoryDemo {

    public static void main(String[] args){
         AbsBmwFactory bmwFactory = new AbsBmwFactory();
         // 抽象工厂先实例化造车工厂 -> 造车工厂再实例化出车型 -> 造车
         bmwFactory.carFactory().carFactory().createCar();
         bmwFactory.createAirCondition().makeAirCondition();

         AbsBydFactory bydFactory = new AbsBydFactory();
         bydFactory.carFactory().carFactory().createCar();
         bydFactory.createAirCondition().makeAirCondition();
    }

}
