package com.fourforfour.eldanialight;

import com.fourforfour.eldanialight.areas.BattleArea;
import com.fourforfour.eldanialight.areas.ShopArea;
import com.fourforfour.eldanialight.battle.BattleSequence;

import java.util.ArrayList;
import java.util.List;

/**
 * Area Kommands is a singletonclass that will hold premade command instances for the application
 */

public class AreaKommands {
    public static List<Command> shopCommand = new ArrayList<>();
    public static List<Command>  worldCommand = new ArrayList<>();
    public static List<Command>  battleCommand = new ArrayList<>();

    AreaKommands(){
        shopCommand.add(Command.BUY);
        shopCommand.add(Command.SELL);
        shopCommand.add(Command.LEAVE);
        shopCommand.add(Command.VIEW_ITEMS);

        worldCommand.add(Command.VIEW);
        worldCommand.add(Command.VENTURE);
        worldCommand.add(Command.VIEW_ITEMS);

        battleCommand.add(Command.ATTACK);
        battleCommand.add(Command.RUN);
        battleCommand.add(Command.ITEM);
        battleCommand.add(Command.VENTURE);
        battleCommand.add(Command.VIEW_ITEMS);
    }

    public static void commands(Command c){
        switch (c){
            case BUY:
                if(Game.currentArea instanceof ShopArea){
                    ShopArea current = (ShopArea) Game.currentArea;
                    current.vendor.barter(current.getItems());
                }
                System.out.println("Buying");
                break;
            case EXIT:
                System.out.println("Exiting");
                break;
            case GO:
                System.out.println("Going");
                break;
            case RUN:
                System.out.println("Running");
                break;
            case ITEM:
                System.out.println("Iteming");
                break;
            case SELL:
                System.out.println("Selling");
                break;
            case VIEW:
                System.out.println("Viewing");
                break;
            case LEAVE:
                System.out.println("Leaving");
                break;
            case ACCEPT:
                System.out.println("Accepting");
                break;
            case ATTACK:
                if(Game.currentArea instanceof BattleArea){
                    BattleArea area = (BattleArea) Game.currentArea;
                    area.battle();
                }
                break;
            case IGNORE:
                System.out.println("Ignoring");
                break;
            case VENTURE:
                Game.currentArea.venture();
                break;
            case OPEN:
                System.out.println("Opening");
                break;
            case CLOSE:
                System.out.println("Closing");
                break;
            case VIEW_ITEMS:
                Game.character.listItems();
                break;
            default:
                System.out.println("Error");
        }
    }
}
