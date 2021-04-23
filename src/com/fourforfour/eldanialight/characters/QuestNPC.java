package com.fourforfour.eldanialight.characters;

import com.fourforfour.eldanialight.Game;

import java.util.Scanner;

public class QuestNPC extends Character implements InteractActions {
    private String dialog;


    public QuestNPC(String name, int health, int strength, int defense, int bezos, int speed,String dialog) {
        super(name, health, strength, defense, bezos, speed);
        this.dialog = dialog;
    }



//    public static Character warChief(){
//       Character warChief = new QuestNPC();
//       warChief.setName("WarChief");
//
//
//
//        return warChief;
//    }
//    @Override
//    public void talk() {
//        String inputPlaceHolder;
//        Scanner myScanner = new Scanner(System.in);
//        switch (QuestNPC.warChief().getName()) {
//            case "WarChief":
//                System.out.println("Thank you for taking the time to meet with me. I have one quest for you. ");
//                System.out.println("It will be the hardest thing you will ever have to do.");
//                System.out.println("The Quest is to defeat Tyronious the Black, and restore the rightful King to the Throne ");
//                System.out.println("Do you Accept this Quest");
//                inputPlaceHolder = myScanner.nextLine();
//                if(inputPlaceHolder.toLowerCase().equals("accept")){
//                    Game.character.addToQuestLog(new Quest("Slay Tyronious"));
//            }
//
//                break;
//
//        }
//    }

    @Override
    public void talk() {
        System.out.println(dialog);

    }

    @Override
    public void buy() {

    }

    @Override
    public void sell() {

    }
}//EOC