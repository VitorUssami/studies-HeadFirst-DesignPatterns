package facade.interfaces.impl;

import facade.interfaces.Projector;

public class ProjectorImpl implements Projector {

	@Override
	public void on() {
		System.out.println("ProjectorImpl on");
	}

	@Override
	public void off() {
		System.out.println("ProjectorImpl off");		
	}

	@Override
	public void tvMode() {
		System.out.println("ProjectorImpl tvMode");				
	}

	@Override
	public void wideScreenMode() {
		System.out.println("ProjectorImpl wideScreenMode");					
	}
}