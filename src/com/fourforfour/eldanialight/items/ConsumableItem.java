package com.fourforfour.eldanialight.items;

public class ConsumableItem  extends Item{

    private int healthPotion = 50;
    private int manaPotion = 50;

    public int useHealthPotion(int currentHP) {
        return healthPotion + currentHP;
    }

    public int useManaPotion(int currentMP) {
        return manaPotion + currentMP;
    }
}
