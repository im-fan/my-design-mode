package com.project.builder.main.goods.food;

/**
 * 创建扩展Burger的实体类
 *
 *@author: Weiyf
 *@Date: 2019-02-22 17:41
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "vge burger";
    }

    @Override
    public float price() {
        return 20.0f;
    }
}
