package com.project.builder.main.goods.drink;

import com.project.builder.main.goods.Item;
import com.project.builder.main.pkg.Bottle;
import com.project.builder.main.pkg.Packing;

public abstract class ColdDrink implements Item {


    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
