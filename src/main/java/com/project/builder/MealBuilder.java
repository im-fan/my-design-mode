package com.project.builder;

import com.project.builder.main.ext.ChickenBurger;
import com.project.builder.main.ext.Coke;
import com.project.builder.main.ext.Pepsi;
import com.project.builder.main.ext.VegBurger;

/**
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 *
 *@author: Weiyf
 *@Date: 2019-02-22 17:47
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareChickenVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
