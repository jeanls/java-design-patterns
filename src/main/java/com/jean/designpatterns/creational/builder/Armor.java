package com.jean.designpatterns.creational.builder;

import lombok.Getter;

@Getter
public enum Armor {
    CHAIN_MAIL("CHAIN MAIL"),
    CLOTHES("CLOTHES"),
    LEATHER("LEATHER"),
    PLATE_MAIL("PLATE MAIL");

    Armor(String title) {
        this.title = title;
    }

    private final String title;
}
