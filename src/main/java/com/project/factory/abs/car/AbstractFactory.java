package com.project.factory.abs.car;

import com.project.factory.abs.prodect.Aircondition;
import com.project.factory.factory.Factory;

/**
 * 抽象工厂类
 *
 *@author: Weiyf
 *@Date: 2019-02-13 15:28
 */
public interface AbstractFactory {

    public Aircondition createAirCondition();

    public Factory carFactory();

}
