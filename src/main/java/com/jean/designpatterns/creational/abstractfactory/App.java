package com.jean.designpatterns.creational.abstractfactory;

import lombok.Getter;

@Getter
public class App {

    private final Army army;
    private final King king;
    private final Castle castle;

    App(KingdomFactory factory) {
        army = factory.createArmy();
        king = factory.createKing();
        castle = factory.createCastle();
    }
}
