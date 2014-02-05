package command.complete;

import command.complete.commands.Command;
import command.complete.commands.NoCommand;

public class RemoteControlWithUndo {
	
	private final int SLOTS = 7;
	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand;
	
	
	public RemoteControlWithUndo(){
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		NoCommand noCommand = new NoCommand();
		undoCommand = noCommand;
		
		for (int i = 0; i < SLOTS; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot){
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot){
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonPushed(){
		undoCommand.undo();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < SLOTS; i++) {
			sb.append(String.format("slot[%s] %s \t %s\n", i, onCommands[i],
					offCommands[i]));
		}
		return sb.toString();
	}
}