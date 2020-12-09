package com.project.order;

import com.project.order.main.BuyStock;
import com.project.order.main.SellStock;
import com.project.order.main.Stock;

/**
 * 命令模式demo
 *
 *@author: Weiyf
 *@Date: 2019-02-25 10:10
 */
public class CommandPatternDemo {

    public static void main(String[] args){
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }

}
