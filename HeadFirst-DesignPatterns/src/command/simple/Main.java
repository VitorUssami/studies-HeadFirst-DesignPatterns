package command.simple;

public class Main {
	
	public static void main(String[] args) {
		
		SimpleRemoteControl control = new SimpleRemoteControl();
		
		LightOnCommand lightOn = new LightOnCommand(new Light());
		
		control.setCommand(lightOn);
		
		control.buttonWasPressed();
	}
}