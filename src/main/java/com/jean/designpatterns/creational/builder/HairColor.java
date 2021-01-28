package com.jean.designpatterns.creational.builder;

import lombok.Getter;

@Getter
public enum HairColor {
    BLACK("BLACK"),
    BLOND("BLOND"),
    BROWN("BROWN"),
    RED("RED"),
    WHITE("WHITE");

    HairColor(String title) {
        this.title = title;
    }

    private final String title;
}
