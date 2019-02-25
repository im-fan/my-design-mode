package com.project.strategy.operation;

import com.project.strategy.Computer;

/**
 * 实现新增操作
 *
 *@author: Weiyf
 *@Date: 2019-02-12 17:25
 */
public class OperationAdd implements Computer {
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
