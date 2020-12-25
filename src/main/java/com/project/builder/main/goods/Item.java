package com.project.builder.main.goods;

import com.project.builder.main.pkg.Packing;

/**
 *
 *创建一个表示食物条目 1
 *@author: Weiyf
 *@Date: 2019-02-22 17:33
 */
public interface Item {

    public String name();
    public Packing packing();
    public float price();

}
