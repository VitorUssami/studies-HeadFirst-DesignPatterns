package observer.v0;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject subject){
		this.weatherData = subject;
		subject.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("CurrentConditionsDisplay: "+temperature+"F degrees and "+ humidity + "% humidity");
	}

	@Override
	public void update(float temp, float humidity, float preasure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}
}