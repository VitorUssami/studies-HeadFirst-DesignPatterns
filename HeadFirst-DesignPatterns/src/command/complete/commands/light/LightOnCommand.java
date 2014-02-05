package command.complete.commands.light;

import command.complete.commands.Command;
import command.complete.objects.Light;

public class LightOnCommand implements Command {

	private Light light;
	
	
	public LightOnCommand( Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}
}