package com.fourforfour.eldanialight;

import com.fourforfour.eldanialight.areas.Area;
import com.fourforfour.eldanialight.areas.AreaList;
import com.fourforfour.eldanialight.areas.WorldAreas;

import java.util.ArrayList;
import java.util.HashMap;

public class World implements WorldAreas {
    HashMap<String, ? super Area> world = new HashMap<>();
    AreaKommands areaKommands = new AreaKommands();

    public World() {

        world.put("lucino town", lucino_town);
        world.put("lucino shops", lucino_shops);
        world.put("lucino front gate", lucino_front_gate);
        world.put("open world", open_world);
        world.put("evil forest", evil_forest);
        world.put("badlands", badlands);
        world.put("armory", armory);
        world.put("fire mountain", fire_mountain);
        world.put("castle eldina", castle_eldina);
        world.put("inner evil forest" , inner_evil_forest);
        world.put("magic", magic);
    }

    public Area get(String input) {
        return (Area) world.get(input);
    }
}
