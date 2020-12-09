package com.project.order;

import com.project.order.main.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建命令调用类
 *
 *@author: Weiyf
 *@Date: 2019-02-25 10:09
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }


}
