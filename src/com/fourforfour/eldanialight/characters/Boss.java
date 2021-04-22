package com.fourforfour.eldanialight.characters;

public class Boss extends Character implements BattleActions {

    public Boss(String name, int health, int strength, int defense ) {


        setName(name);
        setHealth(health);
        setStrength(strength);
        setDefense(defense);

    }

    @Override
    public void attack() {

    }

    @Override
    public void run() {

    }

    @Override
    public void defend() {

    }

    @Override
    public void use() {

    }
}//EOC