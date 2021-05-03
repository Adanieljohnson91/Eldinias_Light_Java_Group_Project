package com.fourforfour.eldanialight.areas;

import com.fourforfour.eldanialight.characters.Enemy;

import java.util.ArrayList;

public class EnemyGenerator {
    private static BattleAreaTypes battleAreaType;


    public static Enemy generate(BattleAreaTypes area){
        return  newEnemy(area);
    }

    private static Enemy newEnemy(BattleAreaTypes area){
        ArrayList<Enemy> mountainEnemy = new ArrayList<Enemy>();
        mountainEnemy.add( new Enemy("Mountain Goat", 12, 21, 21, 1, 12 ,12, 10));
        mountainEnemy.add(new Enemy("Sky Dragon", 11, 12, 21, 21, 21 ,12, 10));
        mountainEnemy.add(new Enemy("Dark Mist", 12, 21, 21, 12, 12 ,12, 50));
        mountainEnemy.add( new Enemy("Fire drake", 11, 12, 21, 2, 21 ,12, 10));
        mountainEnemy.add(new Enemy("Dark Mist", 12, 21, 21, 12, 12 ,12, 50));
        Enemy result;
        switch (area){
            case MOUNTAINS:

                result = mountainEnemy.get(0);//new Enemy("Mountain Goat", 12, 21, 21, 1, 12 ,12, 10);
                break;
            case SKY:
                result = new Enemy("Sky Dragon", 11, 12, 21, 21, 21 ,12, 10);
                break;
            case DARK:
                result = new Enemy("Dark Mist", 12, 21, 21, 12, 12 ,12, 50);
                break;
            case FIRE:
                result = new Enemy("Fire drake", 11, 12, 21, 2, 21 ,12, 10);
                break;
            case DESERT:
                result = new Enemy("Sand Golem", 12, 21, 12, 2, 21 ,12, 10);
                break;
            case TUNDRA:
                result = new Enemy("Wolf",30,60,30,40,20,10,30);
            case GIANT:
                //RANDOM NUM GENERATOR
                //RETURN GIANT_MONSTER_ARRAY[INDEX_RANDOM]
                //MAY NEED SEPERATE SWITCH FOR EACH ENEMY...
                result = new Enemy("Andre the Giant",100,100,150,35,0,100,150);
                break;
            case DRAGON:
                result = new Enemy("Haku",125,100,80,150,60,100,150);
            case WARLOCK:
                result = new Enemy("Tyroneious the Black",300,150,150,150,150,10000,1000);
                break;
            default:
                result = new Enemy("Unknown Enemy", 999, 999, 999, 999, 999 ,999, 99999);
        }
        return result;
    }
}
