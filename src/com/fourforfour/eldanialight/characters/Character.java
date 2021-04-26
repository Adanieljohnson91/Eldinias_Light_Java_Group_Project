package com.fourforfour.eldanialight.characters;

import com.fourforfour.eldanialight.items.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Character {

    //FIELDS
    private String name;
    private int health;
    private int strength;
    private int defense;
    private int bezos;
    private int intel;
    private int speed;
    private PlayerType playerType;
    List<Item> items = new ArrayList<>();
    List<Item> equipment = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);




    //CONSTRUCTOR

    //no args
    public Character() {

    }
    //This constructor was to all for original enemy creation

    //all args
    public Character(String name, int health, int strength, int defense, int bezos, int intel, int speed) {

    }

   // public Character(String name, int health, int strength, int defense, int bezos, int speed) {
    //}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getBezos() {
        return bezos;
    }

    public void setBezos(int bezos) {
        this.bezos = bezos;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addWearableItem(WearItem item) {
        item.equipItem(this);
        equipment.add(item);
    }

    // list items
    public void listItems(){
        for(Item item : items){
            System.out.println(item.getName());
        }
        selectItem();
    }

    // select item
    public void selectItem(){
        System.out.println("Which Item would you like to select? ");
        String userInput = scanner.nextLine();
        if(checkItem(userInput)){
            useItem(findItem(userInput));
        }else{
            System.out.println("Invalid Selection");
            selectItem();
        }
    }

    // check item  -- Will check to see if item is in player inventory
    public boolean checkItem(String itemName){
        for(Item currentItem: items){
            if(itemName.equalsIgnoreCase(currentItem.getName())){
                return true;
            }
        }
        return false;
    }

    // check item type and will use appropriately
    public void useItem(Item item){
        if(item instanceof ConsumableItem){
            ((ConsumableItem) item).useItem(this);
        }else if(item instanceof WearItem){
            WearItem armor = (WearItem) item;
            equip(armor);
        }
    }

    public void equip(WearItem item){
        System.out.println("Equip or Cancel");
        String userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("Equip")){
            item.equipItem(this);
            addWearableItem(item);
        }else{
            // sout("Invalid Selection")
        }
    }

    public Item findItem(String itemName){
        for(Item currentItem : items){
            if(itemName.equalsIgnoreCase(currentItem.getName())){
                return currentItem;
            }
        }
        return null;
    }
}//EOC
