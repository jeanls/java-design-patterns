package com.jean.designpatterns.creational.builder;

import lombok.Getter;

@Getter
public enum Profession {
    MAGE("MAGE"),
    PRIEST("PRIEST"),
    THIEF("THIEF"),
    WARRIOR("WARRIOR");

    Profession(String title) {
        this.title = title;
    }

    private final String title;
}
