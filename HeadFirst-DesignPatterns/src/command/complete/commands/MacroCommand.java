package command.complete.commands;

public class MacroCommand implements Command{

	private Command[] commands;
	
	public MacroCommand(Command[] commands){
		this.commands = commands;
	}
	
	@Override
	public void execute() {
		System.out.println("-------------- MacroCommand --------------");
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].undo();
		}
		
	}
}
