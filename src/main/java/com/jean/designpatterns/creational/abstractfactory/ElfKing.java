package com.jean.designpatterns.creational.abstractfactory;

public class ElfKing implements King {

    static final String DESCRIPTION = "This is the elf king";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
