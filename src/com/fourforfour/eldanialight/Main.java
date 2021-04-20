package com.fourforfour.eldanialight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner myScanner = new Scanner(System.in); // Make scanner obj


        while(true){
            System.out.print("$ ");
            String inputString = myScanner.nextLine();
            System.out.println(inputString);
        }
    }
}
