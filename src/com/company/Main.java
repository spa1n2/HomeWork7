package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Magic magic = new Magic();
        Medic medic = new Medic();
        Hero[] heroes = new Hero[]{magic, medic, warrior};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility("Ability");

        }
    }
}
