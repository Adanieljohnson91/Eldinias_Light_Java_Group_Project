package com.fourforfour.eldanialight.characters;

public class ShopNPC extends Character implements InteractActions {
    private String dialog;


    public ShopNPC(String name, int health, int strength, int defense, int bezos, int speed,String dialog) {
        super(name, health, strength, defense, bezos, speed);
        this.dialog = dialog;
    }

    @Override
    public void talk() {
        System.out.println(" Hello traveler what can I do for you?");
    }

    @Override
    public void buy() {

    }

    @Override
    public void sell() {
        System.out.println("");
    }


}//EOC
