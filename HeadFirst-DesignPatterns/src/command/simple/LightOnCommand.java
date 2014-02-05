package command.simple;

public class LightOnCommand implements Command {

	private Light light;
	
	
	public LightOnCommand( Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}
}


class Light{
	
	public void on(){
		System.out.println("Light is on");
	}
}