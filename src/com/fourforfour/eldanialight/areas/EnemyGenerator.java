package com.fourforfour.eldanialight.areas;

import com.fourforfour.eldanialight.characters.Enemy;
import com.fourforfour.eldanialight.items.Item;

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
                result = new Enemy("Andre the Giant",100,100,150,35,0,100,150,"Rope");
                break;
            case DRAGON:
                result = new Enemy("Haku",125,100,80,150,60,100,150,"scale");
                break;
            case WARLOCK:
                result = new Enemy("Tyronious the Black",300,150,150,150,150,10000,1000,"gem");
                break;
            default:
                result = new Enemy("Unknown Enemy", 999, 999, 999, 999, 999 ,999, 99999,"unknown");
        }
        return result;
    }
}
