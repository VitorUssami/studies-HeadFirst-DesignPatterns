package facade.interfaces.impl;

import facade.interfaces.TheaterLights;

public class TheaterLightsImpl implements TheaterLights {

	@Override
	public void on() {
		System.out.println("TheaterLightsImpl on");
	}

	@Override
	public void off() {
		System.out.println("TheaterLightsImpl off");
	}

	@Override
	public void dim() {
		System.out.println("TheaterLightsImpl dim");
	}
}