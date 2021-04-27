package com.fourforfour.eldanialight.items;

import com.fourforfour.eldanialight.characters.Character;

public class WearItem extends Item{
    private int health;
    private int defense;
    private int attack;

    public WearItem(String name, int health, int defense, int attack) {
        super(name);
        this.health = health;
        this.defense = defense;
        this.attack = attack;
    }

    public void equipItem(Character character){
        character.setHealth(character.getHealth() + health);
        character.setDefense(character.getDefense() + defense);
        character.setStrength(character.getStrength() + attack);
    }

    public void unequipItem(Character character){
        character.setHealth(character.getHealth() - health);
        character.setDefense(character.getDefense() - defense);
        character.setStrength(character.getStrength() - attack);
    }

    // WearItem
    // Need player, ItemType,
}
