package com.jean.designpatterns.creational.builder;

import lombok.Getter;

@Getter
public enum Weapon {
    AXE("AXE"),
    BOW("BOW"),
    DAGGER("DAGGER"),
    SWORD("SWORD"),
    WAR_HAMMER("WAR HAMMER");

    Weapon(String title) {
        this.title = title;
    }

    private final String title;
}
