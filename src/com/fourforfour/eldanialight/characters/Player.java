package com.fourforfour.eldanialight.characters;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Player extends Character {

    private List<Quest> questLog = new ArrayList<>();


    public Player(String name, int health, int strength, int defense, int bezos,int intel, int speed, List<Quest> questLog) {
        super(name, health, strength, defense, bezos,intel, speed);
        this.questLog = questLog;
    }

    public Player() {

    }

    public static Player createPlayer(){
        Player player = new Player();
        Scanner myScanner = new Scanner(System.in);
        String tempPlayerType ="";


        System.out.println("King: Thank you for coming to aid of Lord Black and the rest of Eldinia!!");
        System.out.println("We must get some information from you  to know how to best help you defeat Tyronious the Black");

        System.out.println("What shall we call you?  :");
         player.setName(myScanner.nextLine());

        System.out.println("What style of fighter are you? ex. Mage, Knight,  :");
         player.setPlayerType(PlayerType.valueOf(myScanner.nextLine().toUpperCase(Locale.ROOT)));
        player.setHealth(50);
        switch (player.getPlayerType()){
            case MAGE:
                player.setStrength(10);
                player.setSpeed(20);
                player.setIntel(35);
                break;
            case ARCHER:
                player.setStrength(15);
                player.setSpeed(30);
                player.setIntel(15);
                break;
            case KNIGHT:
                player.setStrength(35);
                player.setSpeed(20);
                player.setIntel(5);
                break;
            default:
                System.out.println("You have entered an invalid type");
        }

        System.out.println("Welcome " + player.getName() + " the " + player.getPlayerType() + ".");
        return player;

    }

    public void addToQuestLog(Quest quest){
     questLog.add(quest);

    }
}//EOC
