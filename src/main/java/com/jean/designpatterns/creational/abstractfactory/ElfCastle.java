package com.jean.designpatterns.creational.abstractfactory;

public class ElfCastle implements Castle{

    static final String DESCRIPTION = "This is the elf castle";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
