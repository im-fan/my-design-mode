package com.project.builder.main.goods.food;

import com.project.builder.main.goods.Item;
import com.project.builder.main.pkg.Packing;
import com.project.builder.main.pkg.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
