package facade.interfaces.impl;

import facade.interfaces.Tunner;

public class TunnerImpl implements Tunner {

	@Override
	public void on() {
		System.out.println(" TunnerImpl on");
	}

	@Override
	public void off() {
		System.out.println(" TunnerImpl off");
	}

	@Override
	public void setAm() {
		System.out.println(" TunnerImpl setAm");
	}

	@Override
	public void setFm() {
		System.out.println(" TunnerImpl setFm");
	}

	@Override
	public void setFrequency() {
		System.out.println(" TunnerImpl setFrequency");
	}
}