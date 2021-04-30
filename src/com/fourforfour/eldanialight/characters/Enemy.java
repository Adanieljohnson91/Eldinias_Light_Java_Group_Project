package com.fourforfour.eldanialight.characters;

import com.fourforfour.eldanialight.Game;
import com.fourforfour.eldanialight.battle.Utility;

public class Enemy extends Character implements BattleActions{

    public Enemy(String name,double health, int defense, int strength, int speed,int intel, int bezos ,int xp){
     super(name, health, defense, strength,bezos, speed, intel);
     this.setXp(xp);
    }
    @Override
    public void attack(Character character) {
        Player player = (Player)character;
        double attackingPower = (this.getStrength() + this.getSpeed())* Utility.randomNumber();
        double defendingPower = player.defend()*Utility.randomNumber();

        if(attackingPower>defendingPower) {
            player.setHealth((player.getHealth() - (attackingPower - defendingPower)));
        }
    }


    public boolean run(Character character) {
    return true;
    }

    @Override
    public int defend() {
        return getDefense();

    }

    @Override
    public void use() {

    }


}//EOC
