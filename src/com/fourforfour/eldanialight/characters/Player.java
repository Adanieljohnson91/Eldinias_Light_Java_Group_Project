package com.fourforfour.eldanialight.characters;

import java.util.Scanner;


public class Player extends Character {




    public void createPlayer(){
        Character Player = new Player();
        Scanner myScanner = new Scanner(System.in);
        String tempPlayerType;

        System.out.println("Thank you for Coming to aid of Lord Black and the rest of Eldinia!!");
        System.out.println("We must get some information from you  to know how to best help you defeat Tyronious the Black");

        System.out.println("What shall we call you ");
        Player.setName(myScanner.nextLine());

        System.out.println("What style of fighter are you? ex. Mage, Knight, ");
        Player.setPlayerType(PlayerType.valueOf( myScanner.nextLine()));

        switch (Player.getPlayerType()){
            case Mage:
            case Archer:
            case Knight:
        }






    }

}//EOC
