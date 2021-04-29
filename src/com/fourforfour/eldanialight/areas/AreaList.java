package com.fourforfour.eldanialight.areas;

import com.fourforfour.eldanialight.Game;

import java.util.ArrayList;
import java.util.List;

public class AreaList {
    List<String> areaList = new ArrayList<>();

    public AreaList(String ...strings){
        for(String s: strings){
            areaList.add(s);
        }
    }

    public List<String> getAreaList() {
        return areaList;
    }

    public void view(){
        for(String area: areaList){
            System.out.print("->");
            if(Game.world.get(area) instanceof BattleArea){
                System.out.print("BATTLE: ");
            }
            if(Game.world.get(area) instanceof ShopArea){
                System.out.print("SHOP: ");
            }
            if(Game.world.get(area) instanceof DangerArea){
                System.out.print("OPEN WORLD: ");
            }
            if(Game.world.get(area) instanceof QuestArea){
                System.out.print("QUESTS: ");
            }
            else{
                System.out.print("TOWN: ");
            }
            System.out.println(area);
        }
    }
}
