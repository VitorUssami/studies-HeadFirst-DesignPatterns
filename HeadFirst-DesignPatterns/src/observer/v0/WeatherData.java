package observer.v0;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);	
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float preasure){
		this.humidity = humidity;
		this.pressure = preasure;
		this.temperature = temp;
		measurementsChanged();
	}
	
}