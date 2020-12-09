package com.project.strategy;

import com.project.strategy.operation.OperationAdd;
import com.project.strategy.operation.OperationSubstract;

/**
 * 策略模式实践
 *
 *@author: Weiyf
 *@Date: 2019-02-12 17:35
 */
public class OperationDemo {

    private static void doAdd(int a,int b){
        Context context = new Context(new OperationAdd());
        int result = context.contextOperation(a,b);
        System.out.println(String.format("%s+%s=%s",a,b,result));
    }

    private static void doSubstract(int a,int b){
        Context context = new Context(new OperationSubstract());
        int result = context.contextOperation(a,b);
        System.out.println(String.format("%s-%s=%s",a,b,result));
    }

    public static void main(String[] args){
        int a=5,b=3;
        doAdd(a,b);
        doSubstract(a,b);
    }

}
