package com.fourforfour.eldanialight;

import com.fourforfour.eldanialight.areas.Area;
import com.fourforfour.eldanialight.areas.AreaList;
import com.fourforfour.eldanialight.areas.WorldAreas;

import java.util.ArrayList;
import java.util.HashMap;

public class World implements WorldAreas {
    HashMap<String, Area> world = new HashMap<>();
    AreaKommands areaKommands = new AreaKommands();

    public World(){
        world.put("area1", area1);
        world.put("area2", area2);
        world.put("area3", area3);
        world.put("area4", area4);
        world.put("area5", area5);
        world.put("area6", area6);
        world.put("area7", area7);
    }
}
