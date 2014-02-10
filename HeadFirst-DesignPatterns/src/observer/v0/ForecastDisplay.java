package observer.v0;

@SuppressWarnings("unused")
public class ForecastDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public ForecastDisplay(Subject subject){
		this.weatherData = subject;
		subject.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("ForecastDisplay: "+temperature+"F degrees and "+ humidity + "% humidity");
	}

	@Override
	public void update(float temp, float humidity, float preasure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}
}