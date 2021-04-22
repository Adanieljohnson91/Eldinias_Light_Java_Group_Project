package com.fourforfour.eldanialight.characters;

import java.util.Scanner;


public class Player extends Character {




    public static void createPlayer(){
        Character Player = new Player();
        Scanner myScanner = new Scanner(System.in);
        String tempPlayerType;

        System.out.println("Thank you for Coming to aid of Lord Black and the rest of Eldinia!!");
        System.out.println("We must get some information from you  to know how to best help you defeat Tyronious the Black");

        System.out.println("What shall we call you?  :");
        Player.setName(myScanner.nextLine());

        System.out.println("What style of fighter are you? ex. Mage, Knight,  :");
        Player.setPlayerType(PlayerType.valueOf( myScanner.nextLine()));
        Player.setHealth(50);
        switch (Player.getPlayerType()){
            case Mage:
                Player.setStrength(10);
                Player.setSpeed(20);
                Player.setIntel(35);

            case Archer:
                Player.setStrength(15);
                Player.setSpeed(30);
                Player.setIntel(15);
            case Knight:
                Player.setStrength(35);
                Player.setSpeed(20);
                Player.setIntel(5);

            default:
                System.out.println("You have entered an invalid type");
        }

        System.out.println("Welcome " + Player.getName() + " the " + Player.getPlayerType() + ".");




    }

}//EOC
