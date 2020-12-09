package com.project.strategy;

import com.project.strategy.operation.Computer;

/**
 * 上下文类，用于确定执行的方法
 *
 *@author: Weiyf
 *@Date: 2019-02-12 17:30
 */
public class Context {

    private Computer computer;

    public Context(Computer computer){
        this.computer = computer;
    }

    public int contextOperation(int a,int b){
        return computer.doOperation(a,b);
    }

}
