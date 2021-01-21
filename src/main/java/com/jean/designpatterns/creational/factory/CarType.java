package com.jean.designpatterns.creational.factory;

import lombok.Getter;

import java.util.function.Supplier;

@Getter
public enum CarType {
    FORD(Ford::new),
    FERRARI(Ferrari::new);

    private final Supplier<Car> constructor;

    CarType(Supplier<Car> constructor) {
        this.constructor = constructor;
    }
}
