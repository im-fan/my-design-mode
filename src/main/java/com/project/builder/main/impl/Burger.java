package com.project.builder.main.impl;

import com.project.builder.main.Item;
import com.project.builder.main.Packing;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
