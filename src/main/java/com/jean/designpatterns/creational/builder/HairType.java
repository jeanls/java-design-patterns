package com.jean.designpatterns.creational.builder;

import lombok.Getter;

@Getter
public enum HairType {
    BALD("BALD"),
    CURLY("CURLY"),
    LONG_CURLY("LONG CURLY"),
    LONG_STRAIGHT("LONG STRAIGHT"),
    SHOT("SHOT");

    HairType(String title) {
        this.title = title;
    }

    private final String title;
}
