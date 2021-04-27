package com.fourforfour.eldanialight.areas;

import com.fourforfour.eldanialight.Command;
import com.fourforfour.eldanialight.characters.Enemy;

import java.util.List;


public class BattleArea extends DangerArea{
    public Enemy enemy;
    public BattleArea(String name, AreaList areas, List<Command> command,Enemy enemy,AreaInfo areaInfo) {
        super(name, areas, command,areaInfo);
    }
}
