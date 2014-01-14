package observer.v1;

public class Main {

	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		
		new CurrentConditionsDisplay(weatherData);
		new StatisticsDisplay(weatherData);
		new ForecastDisplay(weatherData);
		
		
		weatherData.setMeasurements(10.0f, 20.0f, 30.0f);
		weatherData.setMeasurements(40.0f, 50.0f, 60.0f);
	}
}
