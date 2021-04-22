package com.fourforfour.eldanialight.areas;

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
            System.out.println(area);
        }
    }
}
