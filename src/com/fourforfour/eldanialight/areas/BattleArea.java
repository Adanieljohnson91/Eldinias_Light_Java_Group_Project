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

    public void battle(){
        battleSequence.battle();
    }

    public String getPreviousArea(){
        return this.previousArea;
    }

    public void showEnemy(){
        System.out.println( "Current enemy is :" +this.enemy.getName());
    }
}
