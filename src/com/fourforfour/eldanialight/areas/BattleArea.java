package com.fourforfour.eldanialight.areas;

import com.fourforfour.eldanialight.Command;
import com.fourforfour.eldanialight.battle.BattleSequence;
import com.fourforfour.eldanialight.characters.Enemy;

import java.util.List;


public class BattleArea extends DangerArea{
    public Enemy enemy;
    private String previousArea;
    private BattleSequence battleSequence;
    public BattleArea(String name, AreaList areas, List<Command> command,Enemy enemy, String previousArea) {
        super(name, areas, command);
        battleSequence = new BattleSequence(enemy);
        this.previousArea = previousArea;
    }

    /**
     * Band aid- Reviving enemy needs to be pulled out... also, may be wise to create an enemy generator.
     */
    public void battle(){
        enemy = new Enemy("Goblin", 10, 2, 3,4,5,34,43);
        battleSequence.battle();
    }

    public String getPreviousArea(){
        return this.previousArea;
    }

    public void showEnemy(){
        System.out.println( "Current enemy is :" +this.enemy.getName());
    }
}
