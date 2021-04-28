package com.fourforfour.eldanialight.areas;

import com.fourforfour.eldanialight.AreaKommands;
import com.fourforfour.eldanialight.characters.Enemy;
import com.fourforfour.eldanialight.characters.NPCDict;
import com.fourforfour.eldanialight.characters.ShopNPC;
import com.fourforfour.eldanialight.items.ItemsOfEldinia;

/**
 * shopCommands
 * townCommands
 * openworldCommands
 * battleCommands
 * will have to keep track of previous location for battle vs dangerArea
 */
public interface WorldAreas {

    Area lucino_town = new SafeArea("lucino town",
            new AreaList("lucino shops", "carnival", "lucino town hall"),
            AreaKommands.worldCommand,AreaInfo.LUCINO_TOWN);

    SafeArea lucino_shops = new SafeArea("lucino shops",
            new AreaList("armory", "magic", "inn", "lucino front gate", "lucino town"),
            AreaKommands.worldCommand,AreaInfo.LUCINO_SHOPS);
    //armory
    ShopArea armory = new ShopArea("armory",
            new AreaList("lucino shops"),
            AreaKommands.shopCommand,
            ItemsOfEldinia.armoryList,
            new ShopNPC("Hank", 10, 10, 10, 10, 10, 34,
                    "Welcome to the Armory"),AreaInfo.LUCINO_SHOPS);

//    //magic shop
    ShopArea magic = new ShopArea("magic",
            new AreaList("lucino shops"),
            AreaKommands.shopCommand,
            ItemsOfEldinia.magicList,
            new ShopNPC("Hans", 10, 10, 10 ,10, 10, 34, "Welcome to the Magic Shop"),AreaInfo.LUCINO_SHOPS);

//    //TODO: uncommit once Inn list is complete commands for staying done
//    //inn will need a command to stay at the inn
////    ShopArea inn = new ShopArea("inn",
////            new AreaList("lucino shops"),
////            AreaKommands.shopCommand,
////            ItemsOfEldinia.innList,
////            new ShopNPC("Ryia", 10, 10, 10 ,10, 10, 34, "Welcome to the Inn will you be staying with us "));
//
//    //front gate
    SafeArea lucino_front_gate = new SafeArea("lucino front gate",
            new AreaList("lucino shops", "open world"),
            AreaKommands.worldCommand, AreaInfo.FRONT_GATE);

    DangerArea open_world = new DangerArea("open world",
            new AreaList("lucino front gate", "badlands", "evil forest", "fire mountain", "castle eldina"),
            AreaKommands.worldCommand,AreaInfo.FRONT_GATE);

//    //Evil forest
    DangerArea evil_forest = new DangerArea("evil forest",
            new AreaList("open world", "inner evil forest", "evil forest lair"),
            AreaKommands.worldCommand,AreaInfo.EVIL_FOREST);
    BattleArea inner_evil_forest = new BattleArea("inner evil forest", new AreaList("evil forest", "evil forest lair"),
            AreaKommands.battleCommand,
            new Enemy("Goblin",10,30,5,4,0,10,30),
            AreaInfo.EVIL_FOREST,"evil forest");
    //badlands
    DangerArea badlands = new DangerArea("badlands",
            new AreaList("open world", "elki town", "fang hill"),
            AreaKommands.worldCommand,AreaInfo.BADLANDS);
    //Mountain
    DangerArea fire_mountain = new DangerArea("fire mountain",
            new AreaList("open world", "base", "slope", "cave"), AreaKommands.worldCommand,AreaInfo.FIRE_MOUNTAIN);
    //castle eldina
    DangerArea castle_eldina = new DangerArea("castle eldina",
            new AreaList("open world", "training grounds", "dungeon", "throne room"),
            AreaKommands.worldCommand, AreaInfo.CASTLE_ELDINA);

}
