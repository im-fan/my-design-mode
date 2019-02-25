package com.project.builder.main.ext;

import com.project.builder.main.impl.Bottle;
import com.project.builder.main.impl.Packing;

public abstract class ColdDrink implements Item {


    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
