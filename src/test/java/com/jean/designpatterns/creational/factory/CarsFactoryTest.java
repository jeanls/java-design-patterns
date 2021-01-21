package com.jean.designpatterns.creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarsFactoryTest {

    @Test
    void fordTest() {
        Car ford = CarsFactory.getCar(CarType.FORD);
        assertEquals("FORD", ford.getDescription());
    }

    @Test
    void ferrariTest() {
        Car ferrari = CarsFactory.getCar(CarType.FERRARI);
        assertEquals("FERRARI", ferrari.getDescription());
    }
}