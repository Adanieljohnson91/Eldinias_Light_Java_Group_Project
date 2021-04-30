package com.fourforfour.eldanialight;

import com.fourforfour.eldanialight.areas.Area;
import com.fourforfour.eldanialight.areas.AreaInfo;
import com.fourforfour.eldanialight.areas.AreaList;
import com.fourforfour.eldanialight.characters.Character;
import com.fourforfour.eldanialight.characters.NPCDict;
import com.fourforfour.eldanialight.characters.NPCList;
import com.fourforfour.eldanialight.characters.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Game {
    public static Area currentArea = new Area("The Beginning", new AreaList("lucino town"), AreaKommands.worldCommand,AreaInfo.LUCINO_TOWN, NPCDict.emptyCharacterList);
    public static Player character;
    public static World world = new World();
    //Commands command ... each command has a list of commands that it can take in
    //as the story progresses, this command will change
    Game(Player character){
        this.character = character;
    }

    public void play(String input) {
        input = input.trim();
        String[] inputs = input.split(" ");
        if(inputs.length > 1){
            input = String.join("_", inputs);
        }
        currentArea.commands(input);
    }

}
