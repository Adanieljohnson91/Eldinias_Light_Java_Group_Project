package com.fourforfour.eldanialight.areas;

import com.fourforfour.eldanialight.AreaKommands;
import com.fourforfour.eldanialight.characters.Enemy;
import com.fourforfour.eldanialight.characters.NPCDict;
import com.fourforfour.eldanialight.characters.QuestNPC;
import com.fourforfour.eldanialight.characters.ShopNPC;
import com.fourforfour.eldanialight.items.Chest;
import com.fourforfour.eldanialight.items.ItemsOfEldinia;
import com.fourforfour.eldanialight.items.UtilityItem;

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
            new AreaList("armory", "magic", "inn", "front gate", "lucino town"),
            AreaKommands.worldCommand,AreaInfo.LUCINO_SHOPS);

    QuestArea lucino_town_hall = new QuestArea("lucino town hall",
            new AreaList("lucino shops","carnival","front gate"),
            AreaKommands.worldCommand,
            new QuestNPC("War Chief",10,10,10,50,10,5,"I am Groot"),AreaInfo.LUCINO_TOWN_HALL);
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
    SafeArea front_gate = new SafeArea("front gate",
            new AreaList("lucino shops", "open world"),
            AreaKommands.worldCommand, AreaInfo.FRONT_GATE);

     //Open World
    DangerArea open_world = new DangerArea("open world",
            new AreaList(" front gate", "badlands", "evil forest", "fire mountain", "castle eldina"),
            AreaKommands.worldCommand,AreaInfo.OPEN_WORLD);

//    //Evil forest
    DangerArea evil_forest = new DangerArea("evil forest",
            new AreaList("open world", "inner evil forest", "evil forest lair"),
            AreaKommands.worldCommand,AreaInfo.EVIL_FOREST);
    BattleArea inner_evil_forest = new BattleArea("inner evil forest", new AreaList("evil forest", "evil forest lair"),
            AreaKommands.battleCommand,
            AreaInfo.INNER_EVIL_FOREST,"evil forest",BattleAreaTypes.DARK);
    BattleArea evil_forest_lair = new BattleArea("inner evil forest", new AreaList("evil forest", "inner evil forest "),
            AreaKommands.battleCommand,
            AreaInfo.EVIL_FOREST_LAIR,"evil forest",BattleAreaTypes.DARK);

    //Badlands
    DangerArea badlands = new DangerArea("badlands",
            new AreaList("open world", "elki town", "fang hill"),
            AreaKommands.worldCommand,AreaInfo.BADLANDS);
    Area elki_town = new SafeArea("elki town",
            new AreaList("badlands", "fang hill"),
            AreaKommands.worldCommand,AreaInfo.ELKI_TOWN);
    BattleArea fang_hill = new BattleArea("fang hill", new AreaList("badlands", "elki town"),
            AreaKommands.battleCommand,
            AreaInfo.FANG_HILL,"fang hill",BattleAreaTypes.DESERT);


    //Mountain
    DangerArea fire_mountain = new DangerArea("fire mountain",
            new AreaList("open world", "base", "cave"), AreaKommands.worldCommand,AreaInfo.FIRE_MOUNTAIN);
    BattleArea base = new BattleArea("base", new AreaList("fire mountain", "cave"),
            AreaKommands.battleCommand,
            AreaInfo.BASE,"base",BattleAreaTypes.MOUNTAINS);
    BattleArea cave = new BattleArea("cave", new AreaList("fire mountain", "base"),
            AreaKommands.battleCommand,
            AreaInfo.CAVE,"cave",BattleAreaTypes.FIRE);



    //castle eldina
    DangerArea castle_eldina = new DangerArea("castle eldina",
            new AreaList("open world", "training grounds", "dungeon", "throne room"),
            AreaKommands.worldCommand, AreaInfo.CASTLE_ELDINA);
    SafeArea training_grounds = new SafeArea("training grounds",
            new AreaList("armory", "magic", "castle eldina","dungeon","throne room"),
            AreaKommands.worldCommand,AreaInfo.TRAINING_GROUNDS);

    BattleArea dungeon = new BattleArea("dungeon", new AreaList("training grounds", "castle eldina","throne room"),
            AreaKommands.battleCommand,

            AreaInfo.DUNGEON,"dungeon",BattleAreaTypes.DARK);
    BattleArea throne_room = new BattleArea("throne room", new AreaList("castle eldina", "dungeon","training grounds"),
            AreaKommands.battleCommand,
            AreaInfo.THRONE_ROOM,"throne room",BattleAreaTypes.DARK);


}
