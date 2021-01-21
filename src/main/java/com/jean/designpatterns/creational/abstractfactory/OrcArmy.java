package com.jean.designpatterns.creational.abstractfactory;

public class OrcArmy implements Army {

    static final String DESCRIPTION = "This is the orc army";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
