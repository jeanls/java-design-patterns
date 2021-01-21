package com.jean.designpatterns.creational.abstractfactory;

public interface KingdomFactory {
    Castle createCastle();
    Army createArmy();
    King createKing();
}
