package com.jean.designpatterns.creational.factory;

public class Ford implements Car {

    private static final String DESCRIPTION = "FORD";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
