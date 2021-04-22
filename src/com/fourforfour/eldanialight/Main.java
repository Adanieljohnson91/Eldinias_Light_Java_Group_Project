package com.fourforfour.eldanialight;

import com.fourforfour.eldanialight.characters.Character;
import com.fourforfour.eldanialight.characters.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ;
        System.out.println("The once peaceful land of Eldina has recently been taken over by the evil warlock Tyroneious" +
                "the Black who has cast a darkness upon the land.\n You are the one chosen to defeat Tyroneious and his " +
                "Army to restore Eldina back to its peaceful ways. \n");
        Scanner myScanner = new Scanner(System.in); // Make scanner obj
        //When the game is started we will have to
        // 1.) Create our character (Should this be like a menu? Can we clear the screen on each selection?
        // 2.) Thread to start intro story?
        Game game = new Game(Player.createPlayer());
        String inputString = "";
        while (true) {
            //Invalid entry should result in list of valid entries
            //Game is always taking in commands play is the master controller.
            System.out.println("Enter a command: ");
            Game.currentArea.printCommands();
            System.out.print("$ ");
            inputString = myScanner.nextLine();
            game.play(inputString);


            if (inputString.equals("exit()")) {
                System.exit(0);
            }
        }
    }


}
