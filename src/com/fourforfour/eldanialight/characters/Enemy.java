package com.fourforfour.eldanialight.characters;

public class Enemy extends Character implements BattleActions{

    public Enemy(int health, int strength, int defense ){

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
