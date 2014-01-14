package observer.v1;

import java.util.Observable;

public class WeatherData extends Observable {

	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
	}

	
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float preasure){
		this.humidity = humidity;
		this.pressure = preasure;
		this.temperature = temp;
		measurementsChanged();
	}


	/**
	 * @return the temperature
	 */
	public float getTemperature() {
		return temperature;
	}


	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}


	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}
	
}