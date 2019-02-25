package com.project.builder.main.ext;

import com.project.builder.main.impl.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
