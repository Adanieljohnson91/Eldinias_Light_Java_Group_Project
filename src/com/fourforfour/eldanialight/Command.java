package com.fourforfour.eldanialight;

enum Commands {
    VIEW_MAP("view map"),
    ACCEPT("accept"),
    IGNORE("ignore"),
    QUIT("quit"),
    INVALID_CMD("invalid command"),
    ATTACK("attack"),
    RUN("run");


    // This class will be used to check commands
    private  String command;

    Commands(String command){
        this.command = command;
    };

    public String command(){
        return this.command;
    }


}
