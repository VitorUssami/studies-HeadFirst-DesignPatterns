package facade.interfaces.impl;

import facade.interfaces.DvdPlayer;


public class DvdPlayerImpl implements DvdPlayer {

	@Override
	public void on() {
		System.out.println("DvdPlayerImpl on");
	}

	@Override
	public void off() {
		System.out.println("DvdPlayerImpl off");
	}

	@Override
	public void eject() {
		System.out.println("DvdPlayerImpl eject");		
	}

	@Override
	public void pause() {
		System.out.println("DvdPlayerImpl pause");			
	}

	@Override
	public void play() {
		System.out.println("DvdPlayerImpl play");	
	}

	@Override
	public void setSurroundAudio() {
		System.out.println("DvdPlayerImpl setSurroundAudio");			
	}

	@Override
	public void setTwoChannelAudio() {
		System.out.println("DvdPlayerImpl setTwoChannelAudio");					
	}

	@Override
	public void stop() {
		System.out.println("DvdPlayerImpl stop");							
	}
}