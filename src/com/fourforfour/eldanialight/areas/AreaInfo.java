package com.fourforfour.eldanialight.areas;


public enum AreaInfo {
    LUCINO_TOWN(""),
    LUCINO_SHOPS(""),
    FRONT_GATE(""),
    OPEN_WORLD(""),
    EVIL_FOREST("a forest full of brown trees. There is a odd smell in the air. There are two trial, one leading" +
            "deeper into the forest, and the second to the Giant's lair"),
    BADLANDS ("Some badlands"),
    FIRE_MOUNTAIN(""),
    CASTLE_ELDINA("");

    String info;

     AreaInfo(String info){
    this.info = info;
    }
    public String getDescription(){
        return info;
    }


//    private String areaDiscription;
//
//
//    AreaInfo(String areaDiscription) {
//        this.areaDiscription = areaDiscription;
//    }
//
//
//    public String getAreaDiscription() {
//        return areaDiscription;
//    }
}//EOC