package command.complete;

import command.complete.commands.Command;
import command.complete.commands.MacroCommand;
import command.complete.commands.ceilingfan.CeilingFanCommand;
import command.complete.commands.light.LightOffCommand;
import command.complete.commands.light.LightOnCommand;
import command.complete.objects.CeilingFan;
import command.complete.objects.Light;

public class Main {
	
	public static void main(String[] args) {
		
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		Light light = new Light();
		
		remoteControl.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
		
		System.out.println("------------------- Light -------------------");
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println();
		System.out.println(remoteControl);
		remoteControl.undoButtonPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println();
		System.out.println(remoteControl);
		remoteControl.undoButtonPushed();
		
		
		System.out.println("------------------- Ceiling Fan -------------------");
		
		remoteControl = new RemoteControlWithUndo();
		
		CeilingFan ceilingFan = new CeilingFan("Living room");
		
		CeilingFanCommand offCommand = new CeilingFanCommand(ceilingFan, CeilingFan.OFF);
		
		
		remoteControl.setCommand(0, new CeilingFanCommand(ceilingFan, CeilingFan.MEDIUM), offCommand);
		remoteControl.setCommand(1, new CeilingFanCommand(ceilingFan, CeilingFan.HIGH), offCommand);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println();
		System.out.println(remoteControl);
		remoteControl.undoButtonPushed();
		
		remoteControl.onButtonWasPushed(1);
		System.out.println();
		System.out.println(remoteControl);
		remoteControl.undoButtonPushed();
		
		
		System.out.println("------------------- Macro -------------------");
		
		remoteControl = new RemoteControlWithUndo();
		
		MacroCommand onCommands = new MacroCommand(new Command[]{new LightOnCommand(light),new CeilingFanCommand(ceilingFan, CeilingFan.HIGH)});
		MacroCommand offCommands = new MacroCommand(new Command[]{new LightOffCommand(light),new CeilingFanCommand(ceilingFan, CeilingFan.OFF)});
		
		remoteControl.setCommand(0, onCommands, offCommands);
		
		System.out.println();
		System.out.println(remoteControl);
		remoteControl.onButtonWasPushed(0);
		System.out.println();
		remoteControl.offButtonWasPushed(0);
		
	}
}
