package com.fourforfour.eldanialight.areas;

import com.fourforfour.eldanialight.AreaKommands;
import com.fourforfour.eldanialight.Command;
import com.fourforfour.eldanialight.Game;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Area {

    private String name;
    private HashMap<String, Character> characters = new HashMap<>();
    private AreaList areas;
    private List<Command> command;
    private Scanner scanner = new Scanner(System.in);

    public AreaList getAreas(){
        return this.areas;
    }

    public Area(String name, AreaList areas, List<Command> command){
        this.name = name;
        this.areas = areas;
        this.command = command;
    }

    public void printCommands(){
        for(Command cmd : command){
            System.out.println(cmd);
        }
    }

    public void commands(String input){
        try{
            AreaKommands.commands(Command.valueOf(input));
        }catch(IllegalArgumentException e){
            System.out.println("Invalid Command");
        }
    }

    public void venture(){
        System.out.println("Where would you like to go?");
        areas.view();
        String destination = scanner.nextLine().toLowerCase(Locale.ROOT);
        if(areas.areaList.contains(destination)){
            Game.currentArea = Game.world.get(destination);
        }else{
            System.out.println("Invalid Entry");
            venture();
        }
    }

    public void viewAreas(){
        areas.view();
    }

}
