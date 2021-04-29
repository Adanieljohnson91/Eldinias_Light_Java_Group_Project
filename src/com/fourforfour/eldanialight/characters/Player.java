package com.fourforfour.eldanialight.characters;

import com.fourforfour.eldanialight.battle.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Player extends Character implements BattleActions {

    private List<Quest> questLog = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public Player(String name, double health, int defense, int strength, int speed, int intel, int bezos, int xp, double maxHealth, List<Quest> questLog) {
        this.setName(name);
        this.setHealth(health);
        this.setDefense(defense);
        this.setStrength(strength);
        this.setSpeed(speed);
        this.setIntel(intel);
        this.setBezos(bezos);
        this.setXp(xp);
        this.questLog = questLog;
        this.setMaxHealth(maxHealth);
    }

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

        // createPlayerType
//        System.out.println("What style of fighter are you? ex. Mage, Knight,  :");
//        player.setPlayerType(PlayerType.valueOf(myScanner.nextLine().toUpperCase(Locale.ROOT)));

            player.setPlayerType(createPlayerClass());


//        createPlayerClass(player);

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
        // ask user what class they want to play
        System.out.println("What style of fighter are you?");
        PlayerType chosenClass = null;
        // store user input
        String userInput = scanner.next();
        try{
            chosenClass = PlayerType.valueOf(userInput);
            return chosenClass;
        }catch (IllegalArgumentException e){
            System.out.println("Invalid");
            return createPlayerClass();
        }
        // iterate over PlayerType Enum
//        return chosenClass;
    }

    public void addToQuestLog(Quest quest) {
        questLog.add(quest);

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
        if ((this.getSpeed() * Utility.randomNumber()) > (enemy.getSpeed() * Utility.randomNumber())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int defend() {
        return getDefense();
    }

    @Override
    public void use() {

    }

    public void revive() {

    }
}//EOC