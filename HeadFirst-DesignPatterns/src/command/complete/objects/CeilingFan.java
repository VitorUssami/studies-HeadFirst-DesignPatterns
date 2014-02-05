package command.complete.objects;

public class CeilingFan {

	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	private String location;
	private int speed;
	
	
	public CeilingFan(String location){
		this.location = location;
		speed = OFF;
	}

	public void high(){
		speed = HIGH;
		log("high");
	}

	public void medium(){
		speed = MEDIUM;
		log("medium");
	}
	
	public void low(){
		speed = LOW;
		log("low");
	}
	
	public void off(){
		speed = OFF;
		log("off");
	}

	private void log(String speed){
		System.out.println(String.format("%s ceiling fan is on %s", location,speed));
	}
	
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	
}