package com.project.builder.main.goods.food;

/**
 * 创建扩展Burger的实体类
 *
 *@author: Weiyf
 *@Date: 2019-02-22 17:41
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chick burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
