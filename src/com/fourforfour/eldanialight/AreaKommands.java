package com.fourforfour.eldanialight;

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
        shopCommand.add(Command.VENTURE);

        worldCommand.add(Command.GO);
        worldCommand.add(Command.VIEW);
        worldCommand.add(Command.ACCEPT);
        worldCommand.add(Command.VENTURE);
        worldCommand.add(Command.IGNORE);

        battleCommand.add(Command.ATTACK);
        battleCommand.add(Command.RUN);
        battleCommand.add(Command.ITEM);
        battleCommand.add(Command.VENTURE);
    }

    public static void commands(Command c){
        switch (c){
            case BUY:
                //Shops will have a buy command
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
                System.out.println("Attacking");
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
            default:
                System.out.println("Error");
        }
    }
}
