package com.github.znznzn707;

import Command.Light;
import Command.LightOffCommand;
import Command.LightOnCommand;
import Command.RemoteControlWithUndo;
import org.junit.Test;

public class CommandTest {

    RemoteControlWithUndo remoteControl = null ;

    @Test
    public void testLight() {
        remoteControl = new RemoteControlWithUndo() ;
        Light livingRoom = new Light("Living Room") ;
        LightOnCommand lightOn = new LightOnCommand(livingRoom) ;
        LightOffCommand lightOff = new LightOffCommand(livingRoom) ;
        remoteControl.setCommand(0,lightOn,lightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
