package com.yaokang.patterns.command;

public class CommandSimulator {

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Light light = new Light("Living room light.");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonPressed();

        simpleRemoteControl.setCommand(lightOffCommand);
        simpleRemoteControl.buttonPressed();

        simpleRemoteControl.undoButtonPressed();
    }

    // 命令将命令动作封装成对象，解耦了命令发出者和命令执行者。
}
