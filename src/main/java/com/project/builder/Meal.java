package com.project.builder;

import com.project.builder.main.ext.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者具体业务
 *
 *@author: Weiyf
 *@Date: 2019-02-22 17:50
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0f;
        for (Item item : items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item : items){
            System.out.println("食品 : "+item.name()
                    + ", 营业员 : "+item.packing().pack()
                    + ", 价格 : "+item.price());
        }
    }

}
