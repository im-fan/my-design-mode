package com.project.builder.main.ext;

import com.project.builder.main.impl.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
