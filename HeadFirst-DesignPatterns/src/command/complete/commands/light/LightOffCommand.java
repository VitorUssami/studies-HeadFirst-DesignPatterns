package command.complete.commands.light;

import command.complete.commands.Command;
import command.complete.objects.Light;

public class LightOffCommand implements Command {

	private Light light;
	
	
	public LightOffCommand( Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
}