package com.fourforfour.eldanialight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner myScanner = new Scanner(System.in); // Make scanner obj
        //When the game is started we will have to
        // 1.) Create our character (Should this be like a menu? Can we clear the screen on each selection?
        // 2.) Thread to start intro story?
        Game game = new Game();
        String inputString = "";
        while(true){
            //Invalid entry should result in list of valid entries.
            System.out.print("$ ");
            inputString = myScanner.nextLine();
            //Game is always taking in commands play is the master controller.

            game.play(inputString);



            if(inputString.equals("exit()")){
                System.exit(0);
            }
        }
    }
}
