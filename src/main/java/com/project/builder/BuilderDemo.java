package com.project.builder;

/**
 * 建造者模式demo
 *
 *@author: Weiyf
 *@Date: 2019-02-22 17:47
 */
public class BuilderDemo {

    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("总金额: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareChickenVegMeal();
        System.out.println("\n\nchicken Meal");
        nonVegMeal.showItems();
        System.out.println("总金额: " +nonVegMeal.getCost());
    }

}
