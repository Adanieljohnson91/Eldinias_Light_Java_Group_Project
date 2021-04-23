package com.fourforfour.eldanialight.characters;

public interface Enemies {
    Enemy goblin = new Enemy("Goblin",50,25,30);
    Enemy wolf = new Enemy("Wolf",30,20,60);
    Enemy troll = new Enemy("Troll", 60,60,20);
    Enemy undead = new Enemy("undead",50,35,35);
    Boss Giant = new Boss("Andre the Giant",100,100,60,10);
    Boss Dragon = new Boss("Haku",125,70,80,50);
    Boss Tyroneious = new Boss("Tyroneious the Black",300,100,100,150);
}
