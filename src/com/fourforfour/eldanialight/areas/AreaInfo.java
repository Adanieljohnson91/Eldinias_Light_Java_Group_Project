package com.fourforfour.eldanialight.areas;


import com.fourforfour.eldanialight.characters.Enemy;

public enum AreaInfo {
    //areas of Lucino town
    LUCINO_TOWN(""),
    LUCINO_SHOPS(""),
    FRONT_GATE(""),

    OPEN_WORLD("A vast open area. You see a sign that point to the evil forest, badlands, fire mountain" +
            "and Castle Eldina"),

    //evil forest and areas within
    EVIL_FOREST("A forest full of brown trees. There is a odd smell in the air. There are two trial, one leading" +
            "deeper into the forest, and the second to the Giant's lair"),
    INNER_EVIL_FOREST("The path takes you deeper into the forest and it starts to get darker. You hear a sinister sound" +
            "you look and see a (insert enemy)"),
    EVIL_FOREST_LAIR(""),

    //Badlands and areas within
    BADLANDS ("Some badlands"),
    ELKI_TOWN("A small town that sits within the Badlands. The people seem to be on edge"),
    FANG_HILL("A hill covered area known to be home of wolves. you should be careful as they can attack from nowhere"),
    //fire mountain and areas
    FIRE_MOUNTAIN(""),
    BASE(""),
    CAVE(""),
    //castle eldina and areas
    CASTLE_ELDINA(""),
    TRAINING_GROUNDS(""),
    DUNGEON(""),
    THRONE_ROOM("");


    String info;

     AreaInfo(String info){
    this.info = info;
    }
    public String getDescription(){
        return info;
    }



}//EOC