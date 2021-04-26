package com.fourforfour.eldanialight.characters;

public class NPCDict {
    private static QuestNPC warcheif = new QuestNPC("War Chief",10,10,10,50,10,5,"I am Groot");

    private static ShopNPC blacksmith = new ShopNPC("Black Smith",5,5,5,1500,5,1,"Welcome to my Shop");

    private static ShopNPC shopkeep = new ShopNPC("Shop Keeper",5,5,5,2000,5,1,"Welcome to my Shop");

    private static ShopNPC innkeep = new ShopNPC("Inn Keeper",5,5,5,1000,5,1,"Welcome to the Inn");

    public static NPCList characterList = new NPCList(warcheif, blacksmith, innkeep, shopkeep);

    ShopNPC getBlacksmith = new ShopNPC("Black Smith",5,5,5,1500,5,1,"Welcome to my Shop");



}//EOC