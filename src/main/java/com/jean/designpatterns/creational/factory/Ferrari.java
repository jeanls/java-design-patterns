package com.jean.designpatterns.creational.factory;

public class Ferrari implements Car {

    private static final String DESCRIPTION = "FERRARI";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
