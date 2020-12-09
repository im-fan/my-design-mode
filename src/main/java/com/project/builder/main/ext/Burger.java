package com.project.builder.main.ext;

import com.project.builder.main.impl.Packing;
import com.project.builder.main.impl.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
