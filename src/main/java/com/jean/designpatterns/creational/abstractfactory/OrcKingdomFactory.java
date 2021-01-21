package com.jean.designpatterns.creational.abstractfactory;

public class OrcKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }
}
