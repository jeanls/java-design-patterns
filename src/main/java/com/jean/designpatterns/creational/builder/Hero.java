package com.jean.designpatterns.creational.builder;

import lombok.Getter;

@Getter
public final class Hero {

    private Profession profession;
    private String name;
    private HairType hairType;
    private HairColor hairColor;
    private Armor armor;
    private Weapon weapon;

    private Hero() {

    }

    public Hero (Builder builder) {
        profession = builder.getProfession();
        name = builder.getName();
        hairType = builder.getHairType();
        hairColor = builder.getHairColor();
        armor = builder.getArmor();
        weapon = builder.getWeapon();
    }

    public static Builder builder(Profession profession, String name) {
        return new Builder(profession, name);
    }
}
