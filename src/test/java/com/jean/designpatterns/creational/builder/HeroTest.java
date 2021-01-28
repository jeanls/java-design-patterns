package com.jean.designpatterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    void builderTest() {
        Hero hero = Hero.builder(Profession.MAGE, "Jean")
                .withArmor(Armor.LEATHER)
                .withHairColor(HairColor.BLACK)
                .withWeapon(Weapon.SWORD)
                .withHairType(HairType.CURLY)
                .build();

        assertEquals(Profession.MAGE, hero.getProfession());
        assertEquals("Jean", hero.getName());
        assertEquals(HairColor.BLACK, hero.getHairColor());
        assertEquals(Weapon.SWORD, hero.getWeapon());
        assertEquals(HairType.CURLY, hero.getHairType());
        assertEquals(Armor.LEATHER, hero.getArmor());
    }

}