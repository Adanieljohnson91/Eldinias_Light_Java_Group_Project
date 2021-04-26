package com.fourforfour.eldanialight.items;

import com.fourforfour.eldanialight.characters.Player;

public class ConsumableItem  extends Item{

    private int enhancer;
    private ItemType type;

    public ConsumableItem(String name, int enhancer, ItemType type) {
        super(name);
        this.enhancer = enhancer;
        this.type = type;
    }

    public void useItem(Player player){
        switch (this.type){
            case HEALTH:
                player.setHealth(player.getHealth() + enhancer);
                break;
            case DEFENCE:
                player.setDefense(player.getDefense() + enhancer);
                break;
            case INTELLECT:
                player.setIntel(player.getIntel() + enhancer);
                break;
            default:
                System.out.println("Cant help you...");
        }
    }

    //method that checks type of potion and calls function accordingly


}
