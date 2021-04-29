package com.fourforfour.eldanialight.characters;

public interface Enemies {


    // Below are the Enemies, they are all from the Enemy Class and have attributes based on level, easy, medium, hard
    // Bosses are Super enemies that

    /*
     * Easy enemies stats can have values in these ranges
     * Health:15-30 , defense: 10-20 , strength: 10-20, speed:15-30, intel 0 , bezos 10-15, xp 20-30
     */
    Enemy undead = new Enemy("undead",50,35,35,35 ,0,10,20);
    Enemy goblin = new Enemy("Goblin",50,30,25,40,0,10,20);

    /*
     * Medium enemies stats can have values in these ranges
     * Health: 30-50 , defense: 10-20 , strength: 10-20, speed:15-30, intel 0 , bezos 10-15, xp 20-30
     */
    Enemy wolf = new Enemy("Wolf",30,60,30,40,20,10,30);
    Enemy troll = new Enemy("Troll", 60,45,60,15,0,35,40);

    //Hard Enemies
    Enemy superWolf = new Enemy("Super Wolf",60,60,60,60,40,60,50);

    //Boss
    Boss Giant = new Boss("Andre the Giant",100,100,150,35,0,100,150);
    Boss Dragon = new Boss("Haku",125,100,80,150,60,100,150);
    Boss Tyroneious = new Boss("Tyroneious the Black",300,150,150,150,150,10000,1000);


}
