package com.project.factory.abs.car;

import com.project.factory.abs.prodect.Aircondition;
import com.project.factory.abs.prodect.BydAirCondition;
import com.project.factory.factory.BydFactory;
import com.project.factory.factory.Factory;

/**
 * 实现抽象工厂，实现自己的业务
 *
 *@author: Weiyf
 *@Date: 2019-02-13 15:33
 */
public class AbsBydFactory implements AbstractFactory {
    @Override
    public Aircondition createAirCondition() {
        return new BydAirCondition();
    }

    @Override
    public Factory carFactory() {
        return new BydFactory();
    }
}
