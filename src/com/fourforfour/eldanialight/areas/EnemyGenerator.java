package com.fourforfour.eldanialight.areas;

import com.fourforfour.eldanialight.characters.Enemy;

public class EnemyGenerator {
    private static BattleAreaTypes battleAreaType;


    public static Enemy generate(BattleAreaTypes area){
        return  newEnemy(area);
    }

    private static Enemy newEnemy(BattleAreaTypes area){
        Enemy result;
        switch (area){
            case MOUNTAINS:
                result = new Enemy("Mountain Goat", 12, 21, 21, 1, 12 ,12, 10,"horn");
                break;
            case SKY:
                result = new Enemy("Sky Dragon", 11, 12, 21, 21, 21 ,12, 10,"scale");
                break;
            case DARK:
                result = new Enemy("Dark Mist", 12, 21, 21, 12, 12 ,12, 10,"something");
                break;
            case FIRE:
                result = new Enemy("Fire drake", 11, 12, 21, 2, 21 ,12, 10,"something else");
                break;
            case DESERT:
                result = new Enemy("Sand Golem", 12, 21, 12, 2, 21 ,12, 10,"IDK");
                break;
            case GIANT:
                //RANDOM NUM GENERATOR
                //RETURN GIANT_MONSTER_ARRAY[INDEX_RANDOM]
                //MAY NEED SEPERATE SWITCH FOR EACH ENEMY...
                result = new Enemy("Sand Golem", 12, 21, 12, 2, 21 ,12, 10,"sand");
                break;
            case DRAGON:
                result = new Enemy("Sand Golem", 12, 21, 12, 2, 21 ,12, 10,"blob");
                break;
            case WARLOCK:
                result = new Enemy("Sand Golem", 12, 21, 12, 2, 21 ,12, 10,"gem");
                break;
            default:
                result = new Enemy("Unknown Enemy", 999, 999, 999, 999, 999 ,999, 99999,"unknown");
        }
        return result;
    }
}
