package facade.interfaces.impl;

import facade.interfaces.CdPlayer;

public class CdPlayerImpl implements CdPlayer {

	@Override
	public void on() {
		System.out.println("CdPlayerImpl on");
	}

	@Override
	public void off() {
		System.out.println("CdPlayerImpl off");
	}

	@Override
	public void eject() {
		System.out.println("CdPlayerImpl eject");
	}

	@Override
	public void pause() {
		System.out.println("CdPlayerImpl pause");
	}

	@Override
	public void play() {
		System.out.println("CdPlayerImpl play");
	}

	@Override
	public void stop() {
		System.out.println("CdPlayerImpl stop");		
	}
}