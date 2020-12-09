package com.project.strategy.operation;

/**
 * 实现减操作
 *
 *@author: Weiyf
 *@Date: 2019-02-12 17:25
 */
public class OperationSubstract implements Computer {
    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}
