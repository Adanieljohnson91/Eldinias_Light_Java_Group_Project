package com.fourforfour.eldanialight;

import com.fourforfour.eldanialight.characters.Character;
import com.fourforfour.eldanialight.characters.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player.createPlayer();
        System.out.println("Hello, World!");
        Scanner myScanner = new Scanner(System.in); // Make scanner obj
        //When the game is started we will have to
        // 1.) Create our character (Should this be like a menu? Can we clear the screen on each selection?
        // 2.) Thread to start intro story?
        Game game = new Game(new Character());
        String inputString = "";
        while(true){
            //Invalid entry should result in list of valid entries
            //Game is always taking in commands play is the master controller.
            System.out.println("Enter a command: ");
            Game.currentArea.printCommands();
            System.out.print("$ ");
            inputString = myScanner.nextLine();
            game.play(inputString);



            if(inputString.equals("exit()")){
                System.exit(0);
            }
        }
    }


}
