package com.fourforfour.eldanialight;

import com.fourforfour.eldanialight.areas.Area;
import com.fourforfour.eldanialight.areas.AreaList;
import com.fourforfour.eldanialight.characters.Character;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Game {
    public static Area currentArea = new Area("The Beginning", new AreaList("lucino castle"), AreaKommands.worldCommand);
    public static Character character;
    public static World  world = new World();
    //Commands command ... each command has a list of commands that it can take in
    //as the story progresses, this command will change
    Game(Character character){
        this.character = character;
    }

    public void play(String input) {
        currentArea.commands(input);
    }

}
