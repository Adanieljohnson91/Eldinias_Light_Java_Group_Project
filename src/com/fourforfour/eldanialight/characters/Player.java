package com.fourforfour.eldanialight.characters;

import com.fourforfour.eldanialight.battle.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Player extends Character implements BattleActions {

    private List<Quest> questLog = new ArrayList<>();
    int maxLevel = 20;
    int levelUpXp = 100;



    public Player(String name, double health, int defense, int strength, int speed,int intel, int bezos,  int xp, double maxHealth,int level, List<Quest> questLog) {
        this.setName(name);
        this.setHealth(health);
        this.setDefense(defense);
        this.setStrength(strength);
        this.setSpeed(speed);
        this.setIntel(intel);
        this.setBezos(bezos);
        this.setXp(xp);
        this.questLog = questLog;
        this.setMaxHealth(maxHealth);
        this.setLevel(level);
    }

    public Player() {

    }
    // The User is given task of creating their in game player. They are given the option to choose what type of
    //player they will create

    public static Player createPlayer(){
        Player player = new Player();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("King: Thank you for coming to aid of Lord Black and the rest of Eldinia!!");
        System.out.println("We must get some information from you  to know how to best help you defeat Tyronious the Black");

        System.out.println("What shall we call you?:");
         player.setName(myScanner.nextLine());

        System.out.println("What style of fighter are you? ex. Mage, Knight, Archer  :");
         player.setPlayerType(PlayerType.valueOf(myScanner.nextLine().toUpperCase(Locale.ROOT)));

        player.setHealth(50);
        player.setXp(0);
        player.setBezos(50);
        player.setLevel(1);


        switch (player.getPlayerType()){


            /*
             * Each player type will be given initial stats
             * Each PlayerType is given  60 points toward initial strength,speed, and intel
             */
            case MAGE:
                player.setStrength(10);
                player.setSpeed(20);
                player.setIntel(30);
                player.setDefense(20);
                break;
            case ARCHER:
                player.setStrength(15);
                player.setSpeed(25);
                player.setIntel(15);
                player.setDefense(35);
                break;
            case KNIGHT:
                player.setStrength(35);
                player.setSpeed(20);
                player.setIntel(5);
                player.setDefense(30);
                break;
            default:
                System.out.println("You have entered an invalid type");
        }


        System.out.println("Welcome " + player.getName() + " the " + player.getPlayerType() + ".");
        return player;

    }

    public void addToQuestLog(Quest quest){
     questLog.add(quest);

    }

    @Override
    public void attack(Character character) {
        Enemy enemy = (Enemy) character;
        double attackingPower = (this.getStrength()+this.getSpeed())* Utility.randomNumber();
        double defendingPower = enemy.defend()*Utility.randomNumber();

        if(attackingPower>defendingPower) {
            enemy.setHealth(enemy.getHealth() - (attackingPower - defendingPower));
        }
    }

    @Override
    public boolean run(Character character) {
        Enemy enemy = (Enemy) character;
        if((this.getSpeed()*Utility.randomNumber()) > (enemy.getSpeed()*Utility.randomNumber())){
         return true;
       } else {
           return false;
       }
    }

    @Override
    public int defend() {
        return getDefense();
    }

    @Override
    public void use() {

    }

    public void viewStats(){

        System.out.println("Health:" + this.getHealth());
        System.out.println("Defense:" + this.getDefense());
        System.out.println("Strength:" + this.getStrength());
        System.out.println("Speed:" + this.getSpeed());
        System.out.println("Intel:" + this.getIntel());
        System.out.println("Bezos:" + this.getBezos());
        System.out.println("XP:" + this.getXp());
        System.out.println("Level:" + this.getLevel());
    }

    public void addXp(){

    /*
     * This  Method check to see if the player's level is high than the make level.
     * If the level is lower than maxLevel then the method checks the
     */
       if(getLevel()< maxLevel) {
           if (getXp() >= levelUpXp){


               this.setLevel(this.getLevel()+1);
               this.setHealth(this.getHealth()+ 15);
               this.setBezos(this.getBezos() +15);
               System.out.println("You have leveled up!! You are now level:" + this.getLevel());
               /*
                *This switch statement adds to the Stats based on PlayerType
                */
               switch(this.getPlayerType()){
                   case MAGE:
                       this.setDefense(this.getDefense() + 10);
                       this.setStrength(this.getStrength() + 10);
                       this.setSpeed(this.getSpeed() + 15);
                       this.setIntel(this.getIntel() + 25);

                       break;
                   case ARCHER:
                       this.setDefense(this.getDefense() + 15);
                       this.setStrength(this.getStrength() + 15);
                       this.setSpeed(this.getSpeed() +20);
                       this.setIntel(this.getIntel()+ 10);
                       break;
                   case KNIGHT:
                       this.setDefense(this.getDefense() + 20);
                       this.setStrength(this.getStrength() + 25);
                       this.setSpeed(this.getSpeed() + 15 );
                       break;
               }



               this.setDefense(this.getDefense());
               this.setStrength(this.getStrength());
               this.setSpeed(this.getSpeed());
               this.setIntel(this.getIntel());

                levelUpXp = levelUpXp + 100;
           }
       }

    }
}//EOC
