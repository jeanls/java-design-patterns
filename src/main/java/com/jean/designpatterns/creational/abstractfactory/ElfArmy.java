package com.jean.designpatterns.creational.abstractfactory;

public class ElfArmy implements Army {

    static final String DESCRIPTION = "This is the elf army";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
