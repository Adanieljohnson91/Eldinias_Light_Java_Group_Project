package com.fourforfour.eldanialight.characters;

public class Enemy extends Character implements BattleActions{
    //constructors
    public Enemy(){ }

    public Enemy(String name, int health, int strength, int speed){
        this.setName(name);
        this.setHealth(health);
        this.setStrength(strength);
        this.setSpeed(speed);
    }
    public Enemy(String name,int health, int strength, int speed,int intel){
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
