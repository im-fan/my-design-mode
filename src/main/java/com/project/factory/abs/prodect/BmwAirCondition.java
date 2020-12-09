package com.project.factory.abs.prodect;

/**
 * 实现具体业务
 *
 *@author: Weiyf
 *@Date: 2019-02-13 14:48
 */
public class BmwAirCondition implements Aircondition {
    @Override
    public void makeAirCondition() {
        System.out.println("制造宝马汽车空调");
    }
}
