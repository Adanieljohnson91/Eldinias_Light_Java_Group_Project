package com.fourforfour.eldanialight.characters;

public class Boss extends Character implements BattleActions {
    public Boss(){ }

    public Boss(String name, int health, int strength, int speed){
        this.setName(name);
        this.setHealth(health);
        this.setStrength(strength);
        this.setSpeed(speed);
    }
    public Boss(String name,int health, int strength, int speed,int intel){
        this.setName(name);
        this.setHealth(health);
        this.setStrength(strength);
        this.setSpeed(speed);
        this.setIntel(intel);
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