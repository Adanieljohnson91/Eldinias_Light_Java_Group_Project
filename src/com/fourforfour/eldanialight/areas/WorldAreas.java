package com.fourforfour.eldanialight.areas;

import com.fourforfour.eldanialight.AreaKommands;

public interface WorldAreas {
    Area area1 = new Area("goddard",
            new AreaList("area2", "area3", "area4"),
            AreaKommands.shopCommand);
    Area area2 = new Area("kilnor",
            new AreaList("area1", "area5", "area6"),
            AreaKommands.worldCommand);
    Area area3 = new Area("mira",
            new AreaList("area1", "area3", "area4"),
            AreaKommands.battleCommand);
    Area area4 = new Area("fidora",
            new AreaList("area1", "area3", "area4"),
            AreaKommands.shopCommand);
    Area area5 = new Area("volkland",
            new AreaList("area2", "area6", "area3"),
            AreaKommands.worldCommand);
    Area area6 = new Area("area6",
            new AreaList("area5", "area7", "area4"),
            AreaKommands.battleCommand);
    Area area7 = new Area("area7",
            new AreaList("area7", "area6"),
            AreaKommands.battleCommand);
}
