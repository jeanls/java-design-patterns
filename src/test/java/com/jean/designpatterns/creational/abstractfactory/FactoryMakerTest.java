package com.jean.designpatterns.creational.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMakerTest {

    @Test
    void orcKingdomTest() {
        App app = new App(FactoryMaker.makeFactory(KingdomType.ORC));

        assertEquals("This is the orc army", app.getArmy().getDescription());
        assertEquals("This is the orc castle", app.getCastle().getDescription());
        assertEquals("This is the orc king", app.getKing().getDescription());
    }

    @Test
    void elfKingdomTest() {
        App app = new App(FactoryMaker.makeFactory(KingdomType.ELF));

        assertEquals("This is the elf army", app.getArmy().getDescription());
        assertEquals("This is the elf castle", app.getCastle().getDescription());
        assertEquals("This is the elf king", app.getKing().getDescription());
    }
}