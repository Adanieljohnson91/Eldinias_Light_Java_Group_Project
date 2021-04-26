package com.fourforfour.eldanialight.items;

import jdk.jshell.execution.Util;

import java.util.List;

public class ItemsOfEldinia {
    public static WearItem sword = new WearItem("sword",0,0,5);
    public static WearItem shield = new WearItem("shield",5,5,0);
    public static ConsumableItem healthPotion = new ConsumableItem("healthPotion", 10, ItemType.HEALTH);
    public static ConsumableItem manaPotion = new ConsumableItem("manaPotion",10,ItemType.INTELLECT);
    public static ConsumableItem speedPotion = new ConsumableItem("speedPotion",10, ItemType.SPEED);
    public static UtilityItem escapeRope = new UtilityItem("escapeRope");
    public static UtilityItem treasureChestKey = new UtilityItem("treasureChestKey");
    public static WearItem battleAxe = new WearItem("battleAxe",0,0,10);

    public static List<Item> armoryList = new ItemList(sword, shield, healthPotion, manaPotion).getList();
}
