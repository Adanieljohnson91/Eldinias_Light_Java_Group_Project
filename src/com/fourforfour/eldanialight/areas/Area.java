package com.fourforfour.eldanialight.areas;

import com.fourforfour.eldanialight.AreaKommands;
import com.fourforfour.eldanialight.Command;

import java.util.HashMap;
import java.util.List;

public class Area {

    private String name;
    private HashMap<String, Character> characters = new HashMap<>();
    private AreaList areas;
    private List<Command> command;

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
        if(command.contains(Command.valueOf(input))){
            AreaKommands.commands(Command.valueOf(input));
            return;
        }
        System.out.println("ERROR: Please input the following: ");
        printCommands();

    }

    public void viewAreas(){
        areas.view();
    }

}
