package com.fourforfour.eldanialight.characters;

import com.fourforfour.eldanialight.Game;
import com.fourforfour.eldanialight.areas.ShopArea;
import com.fourforfour.eldanialight.items.Item;

import java.util.HashMap;
import java.util.Scanner;

public class ShopNPC extends Character implements InteractActions {
    private String dialog;
    Scanner scanner = new Scanner(System.in);


    public ShopNPC(String name, int health, int strength, int defense, int bezos, int speed,String dialog) {
        super(name, health, strength, defense, bezos, speed);
        this.dialog = dialog;
    }
    public void talk() {
        System.out.println(" Hello traveler what can I do for you?");
    }

    public void buy() {

    }
    public void sell() {
        System.out.println("");
    }

    public void barter(HashMap<String, Item> items){
        this.talk();
        System.out.println("BUY or SElL or LEAVE");
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("BUY")){
            System.out.println("Great, here are available Items: ");
            items.forEach((k, v) -> System.out.println(v.getName()));
            System.out.println("Please Select an Item form above");
            String selectedItem = scanner.nextLine();
            if(items.containsKey(selectedItem)){
                System.out.println("Excellent Choice traveler: +1 " + selectedItem);
                Game.character.addItem(items.get(selectedItem));
            }else{
                barter(items);
            }
        }else if(input.equalsIgnoreCase("SELL")){
            System.out.println("We have no money for you!");
        }else{
            System.out.println("Thank you for coming");
        }
    }


}//EOC
