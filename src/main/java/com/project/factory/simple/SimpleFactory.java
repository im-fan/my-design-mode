package com.project.factory.simple;

import com.project.factory.simple.function.Car;
import com.project.factory.simple.function.Bmw;
import com.project.factory.simple.function.Byd;

/**
 * 简单工厂，根据不同定义执行不同方法
 *
 *@author: Weiyf
 *@Date: 2019-02-13 11:17
 */
public class SimpleFactory {

    public static final String BMW = "bmw";
    public static final String BYD = "byd";

    /** 第一种方式，通过传参实现
     *  缺点:扩展不方便
     * **/
    public Car carFactory(String type){
        if(BMW.equals(type)){
            return new Bmw();
        } else if (BYD.equals(type)){
            return new Byd();
        } else {
            return () -> System.out.println("车系暂不支持");
        }
    }

    /** 第二种方式，通过反射实现 **/
    public Car carFactory(Class clazz){
        try{
            Class classIns = Class.forName(clazz.getName());
            if(classIns != null){
                return (Car) classIns.newInstance();
            }
        } catch (Exception e){
            //System.out.println(e);
        }
        return () -> System.out.println("车系暂不支持");
    }

}
