package com.jean.designpatterns.creational.factory;

public class CarsFactory {

    public static Car getCar(CarType carType) {
        return carType.getConstructor().get();
    }
}
