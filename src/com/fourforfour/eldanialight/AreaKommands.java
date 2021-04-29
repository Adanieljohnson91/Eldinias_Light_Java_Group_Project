package com.fourforfour.eldanialight;

import com.fourforfour.eldanialight.areas.BattleArea;
import com.fourforfour.eldanialight.areas.ShopArea;
import com.fourforfour.eldanialight.battle.BattleSequence;

import java.util.ArrayList;
import java.util.List;

/**
 * AreaKommands is a singletonclass that will hold premade command instances for the application
 */

public class AreaKommands {
    public static List<Command> shopCommand = new ArrayList<>();
    public static List<Command>  worldCommand = new ArrayList<>();
    public static List<Command>  battleCommand = new ArrayList<>();

    AreaKommands(){
        shopCommand.add(Command.SHOP);
        shopCommand.add(Command.LEAVE);
        shopCommand.add(Command.VIEW_ITEMS);

        worldCommand.add(Command.VIEW);
        worldCommand.add(Command.VENTURE);
        worldCommand.add(Command.VIEW_ITEMS);

        battleCommand.add(Command.ATTACK);
        battleCommand.add(Command.RUN);
        battleCommand.add(Command.VIEW);
        battleCommand.add(Command.ITEM);
        battleCommand.add(Command.VENTURE);
        battleCommand.add(Command.VIEW_ITEMS);
    }

    public static void commands(Command c){
        switch (c){
            case SHOP:
                if(Game.currentArea instanceof ShopArea){
                    ShopArea current = (ShopArea) Game.currentArea;
                    current.vendor.barter(current.getItems());
                }
                break;
            case EXIT:
                System.out.println("Exiting");
                break;
            case GO:
                System.out.println("Going");
                break;
            case RUN:
                if(Game.currentArea instanceof BattleArea){
                    BattleArea current = (BattleArea) Game.currentArea;
                    Game.currentArea = Game.world.get(current.getPreviousArea());
                }
                break;
            case ITEM:
                System.out.println("Iteming");
                break;
            case SELL:
                System.out.println("Selling");
                break;
            case VIEW:
                Game.currentArea.getAreaInfo();
                break;
            case LEAVE:
                Game.currentArea = Game.world.get("lucino shops");
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
                Game.character.viewInventory();
                break;
            default:
                System.out.println("Error");
        }
    }
}
