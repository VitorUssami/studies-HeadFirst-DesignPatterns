package command.complete.commands.ceilingfan;

import command.complete.commands.Command;
import command.complete.objects.CeilingFan;


public class CeilingFanCommand implements Command {

	private CeilingFan ceilingFan;
	private int speeed;
	private int prevSpeeed;
	
	
	public CeilingFanCommand(CeilingFan ceilingFan, int speed){
		this.ceilingFan = ceilingFan;
		this.speeed = speed;
	}
	
	
	@Override
	public void execute() {
		prevSpeeed = ceilingFan.getSpeed();
		execute(speeed);
	}

	@Override
	public void undo() {
		execute(prevSpeeed);
	}
	
	private void execute(int speed){
		if(speed == CeilingFan.HIGH){
			ceilingFan.high();
		}else if(speed == CeilingFan.MEDIUM){
			ceilingFan.medium();
		}else if(speed == CeilingFan.LOW){
			ceilingFan.low();
		}else if(speed == CeilingFan.OFF){
			ceilingFan.off();
		}
	}
}
