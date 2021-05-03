package com.fourforfour.eldanialight.characters;

import com.fourforfour.eldanialight.Game;

import java.util.Locale;
import java.util.Scanner;

public class QuestNPC extends Character implements InteractActions {
    private String dialog;
    private Quest quest;
    private boolean questAccepted = false;
    private String name;
    public QuestNPC(String name, double health, int strength, int defense, int bezos, int intel, int speed,String dialog, Quest quest) {
        super(name, health, strength, defense, bezos, intel, speed);
        this.quest = quest;
        this.dialog = dialog;
    }

    private void giveQuest(){
        Game.character.addQuest(quest);
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
    private void offerQuest(){
        if(quest.completion()){
            System.out.println("You have completed the game warrior, not stop being a POS and go live your own life.");
            System.exit(0);
            return;
        }
        if(questAccepted){
            System.out.println("What are you doing wasting time, Eldinia is counting on you!");
            return;
        }
        System.out.println("Are you up to the challenge? will you accept " + quest.getName() + "? ");
        String input = scanner.nextLine().toLowerCase(Locale.ROOT).trim();
        switch (input){
            case "yes":
                questAccepted = true;
                giveQuest();
                break;
            case "no":
                System.out.println("Fair enough");
                break;
            default:
                System.out.println("Invalid entry, please answer me " + Game.character.getName());
                offerQuest();
        }
    }

    @Override
    public void talk() {
        System.out.println(dialog);
        offerQuest();
    }

    @Override
    public void buy() {

    }

    @Override
    public void sell() {

    }
}//EOC