package com.fourforfour.eldanialight.characters;

public class ShopNPC extends Character implements InteractActions {


    public ShopNPC(int bezos){
        setBezos(bezos);
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
