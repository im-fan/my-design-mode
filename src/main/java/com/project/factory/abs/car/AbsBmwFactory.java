package com.project.factory.abs.car;

import com.project.factory.abs.prodect.Aircondition;
import com.project.factory.abs.prodect.BmwAirCondition;
import com.project.factory.factory.BmwFactory;
import com.project.factory.factory.Factory;

/**
 * 实现抽象工厂，实现自己的业务
 *
 *@author: Weiyf
 *@Date: 2019-02-13 15:33
 */
public class AbsBmwFactory implements AbstractFactory {
    @Override
    public Aircondition createAirCondition() {
        return new BmwAirCondition();
    }

    @Override
    public Factory carFactory() {
        return new BmwFactory();
    }
}
