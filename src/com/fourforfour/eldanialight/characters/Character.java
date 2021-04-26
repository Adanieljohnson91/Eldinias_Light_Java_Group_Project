package com.fourforfour.eldanialight.characters;

import com.fourforfour.eldanialight.items.Item;

import java.util.ArrayList;
import java.util.List;

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


    //PlayerClass playerClass


    //CONSTRUCTOR

    //no args
    public Character(){

    }
    //all args
    public Character(String name, int health, int strength, int defense, int bezos,int intel, int speed) {

    }

    public Character(String name, int health, int strength, int defense, int bezos, int speed) {
    }


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

    public void addItem(Item item){
        items.add(item);
    }

    public void useItem(String item){
        //loog for item in list

        //check if item is a consumable

        //apply to characters stat
    }

}//EOC
