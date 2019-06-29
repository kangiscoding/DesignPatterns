package com.yaokang.patterns.command;

public class SimpleRemoteControl {

    Command command;

    public SimpleRemoteControl() {
        this.command = new NoCommand();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPressed() {
        this.command.execute();
    }

    public void undoButtonPressed() {
        this.command.undo();
    }
}
