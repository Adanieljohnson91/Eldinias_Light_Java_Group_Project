package com.fourforfour.eldanialight.items;

import com.fourforfour.eldanialight.areas.QuestArea;
import jdk.jshell.execution.Util;

import java.util.List;

public class ItemsOfEldinia {

    // Weapons
    public static WearItem sword = new WearItem("sword",0,0,5);
    public static WearItem battleAxe = new WearItem("battleAxe",0,0,10);
    public static WearItem bow = new WearItem("bow",0,0,10);
    public static WearItem staff = new WearItem("staff",0,0,10);


    // Armor
    public static WearItem shield = new WearItem("shield",5,5,0);


    //Consumable Items
    public static ConsumableItem healthPotion = new ConsumableItem("healthPotion", 10, ItemType.HEALTH);
    public static ConsumableItem manaPotion = new ConsumableItem("manaPotion",10,ItemType.INTELLECT);
    public static ConsumableItem speedPotion = new ConsumableItem("speedPotion",10, ItemType.SPEED);
    public static ConsumableItem strengthPotion = new ConsumableItem("strengthPotion", 10, ItemType.STRENGTH);


    // Utility Items
    public static UtilityItem escapeRope = new UtilityItem("escapeRope");
    public static UtilityItem treasureChestKey = new UtilityItem("treasureChestKey");

    //Reward Items
    public static RewardItem wolfClaw = new RewardItem("wolf claw");


    // Shop Inventory
    public static List<Item> armoryList = new ItemList(sword, shield, battleAxe).getList();
    public static List<Item> magicList = new ItemList(healthPotion, manaPotion,speedPotion,strengthPotion).getList();


}
