package com.fourforfour.eldanialight.items;

public class Item {
    private String name;
    private int count;

    public Item(){

    }
    public Item(String name) {
        this.setName(name);
        setCount(1);
    }

    public Item(String name, int count){
        setName(name);
        setCount(count);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
