package com.fourforfour.eldanialight.areas;

import com.fourforfour.eldanialight.Command;
import com.fourforfour.eldanialight.items.Item;

import java.util.List;

public class ShopArea extends SafeArea{
    List<Item> items;
    public ShopArea(String name, AreaList areas, List<Command> command, List<Item> item) {
        super(name, areas, command);
        this.items = items;
    }

    public void view(){
        for(Item item: items){
            System.out.println(item.getName());
        }
    }
}
