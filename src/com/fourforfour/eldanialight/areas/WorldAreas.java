package com.fourforfour.eldanialight.areas;

import com.fourforfour.eldanialight.AreaKommands;
import com.fourforfour.eldanialight.items.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * shopCommands
 * townCommands
 * openworldCommands
 * battleCommands
 * will have to keep track of previous location for battle vs dangerArea
 */
public interface WorldAreas{

    Area lucino_castle = new SafeArea("lucino castle",
            new AreaList("lucino shops", "carnival", "lucino housing"),
            AreaKommands.shopCommand);
    ShopArea lucino_shops = new ShopArea("lucino shops",
            new AreaList("armory", "magic", "inn", "lucino front gate", "lucino castle"),
            AreaKommands.worldCommand, new ArrayList<>());
    SafeArea lucino_front_gate = new SafeArea("lucino front gate",
            new AreaList("lucino shops", "open world"),
            AreaKommands.battleCommand);
    DangerArea open_world = new DangerArea("open world",
            new AreaList("lucino front gate", "bad lands", "evil forest"),
            AreaKommands.shopCommand);
    DangerArea evil_forest = new DangerArea("evil forest",
            new AreaList("open world", "inner evil forest", "evil forest lair"),
            AreaKommands.worldCommand);
    DangerArea badlands = new DangerArea("badlands",
            new AreaList("open world", "elki town", "area4"),
            AreaKommands.battleCommand);
    SafeArea area7 = new SafeArea("elki town",
            new AreaList("elki town community area", "open world"),
            AreaKommands.battleCommand);
}
