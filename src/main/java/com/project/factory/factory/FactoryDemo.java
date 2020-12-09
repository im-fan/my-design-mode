package com.project.factory.factory;

import com.project.factory.simple.function.Bmw;
import com.project.factory.simple.function.Byd;

/**
 * 工厂类demo
 *
 *@author: Weiyf
 *@Date: 2019-02-13 11:57
 */
public class FactoryDemo {

    public static void main(String[] args){

        Bmw bmw = new BmwFactory().carFactory();
        bmw.createCar();

        Byd byd = new BydFactory().carFactory();
        byd.createCar();
    }

}
