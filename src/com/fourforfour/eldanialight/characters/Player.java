package com.fourforfour.eldanialight.characters;

import com.fourforfour.eldanialight.battle.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Player extends Character implements BattleActions {

    private List<Quest> questLog = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public Player() {

    }

    public static Player createPlayer() {
        Player player = new Player();

        //create intro
        System.out.println("King: Thank you for coming to aid of Lord Black and the rest of Eldinia!!");
        System.out.println("We must get some information from you  to know how to best help you defeat Tyronious the Black");

        // create PlayerName
        System.out.println("What shall we call you?:");
        player.setName(scanner.nextLine());
        player.setPlayerType(createPlayerClass());
        player.setHealth(50);
        player.setXp(0);
        player.setBezos(50);
        switch (player.getPlayerType()) {
            case MAGE:
                player.setStrength(10);
                player.setSpeed(20);
                player.setIntel(35);
                player.setDefense(30);
                break;
            case ARCHER:
                player.setStrength(15);
                player.setSpeed(30);
                player.setIntel(15);
                player.setDefense(40);
                break;
            case KNIGHT:
                player.setStrength(35);
                player.setSpeed(20);
                player.setIntel(5);
                player.setDefense(45);
                break;
            default:
                System.out.println("You have entered an invalid type");
        }
        System.out.println("Welcome " + player.getName() + " the " + player.getPlayerType() + ".");
        return player;

    }

    public static PlayerType createPlayerClass(){
        System.out.println("What style of fighter are you?");
        String userInput = scanner.next();
        PlayerType chosenClass;
        try{
            chosenClass = PlayerType.valueOf(userInput.toUpperCase(Locale.ROOT));
            return chosenClass;
        }catch (IllegalArgumentException e){
            System.out.println("Invalid");
            return createPlayerClass();
        }
    }

    @Override
    public void attack(Character character) {
        Enemy enemy = (Enemy) character;
        double attackingPower = (this.getStrength() + this.getSpeed()) * Utility.randomNumber();
        double defendingPower = enemy.defend() * Utility.randomNumber();

        if (attackingPower > defendingPower) {
            enemy.setHealth(enemy.getHealth() - (attackingPower - defendingPower));
        }
    }

    @Override
    public boolean run(Character character) {
        Enemy enemy = (Enemy) character;
        return (this.getSpeed() * Utility.randomNumber()) > (enemy.getSpeed() * Utility.randomNumber());
    }

    @Override
    public int defend() {
        return getDefense();
    }

    @Override
    public void use() {

    }
}//EOC