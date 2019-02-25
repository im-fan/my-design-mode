package com.project.order.main;

/**
 * 创建实现类
 *
 *@author: Weiyf
 *@Date: 2019-02-25 10:07
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}