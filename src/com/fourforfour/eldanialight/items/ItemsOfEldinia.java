package com.fourforfour.eldanialight.items;

import java.util.List;

public class ItemsOfEldinia {
    public static Item sword = new Item("sword");
    public static Item shield = new Item("shield");
    public static Item healthPotion = new Item("healthPotion");
    public static Item manaPotion = new Item("manaPotion");
    public static Item escapeRope = new Item("escapeRope");
    public static Item battleAxe = new Item("battleAxe");

    public static List<Item> armoryList = new ItemList(sword, shield, healthPotion, manaPotion).getList();
    public static List<Item> magicList = new ItemList(healthPotion, manaPotion).getList();
}
