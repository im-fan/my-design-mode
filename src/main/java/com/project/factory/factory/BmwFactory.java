package com.project.factory.factory;

import com.project.factory.simple.function.Bmw;

/**
 * 不同业务实现同一个工厂接口
 *
 *@author: Weiyf
 *@Date: 2019-02-13 11:55
 */
public class BmwFactory implements Factory {

    @Override
    public Bmw carFactory() {
        return new Bmw();
    }
}
