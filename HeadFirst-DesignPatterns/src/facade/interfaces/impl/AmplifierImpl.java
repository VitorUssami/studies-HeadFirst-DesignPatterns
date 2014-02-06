package facade.interfaces.impl;

import facade.interfaces.Amplifier;
import facade.interfaces.CdPlayer;
import facade.interfaces.DvdPlayer;
import facade.interfaces.Tunner;

@SuppressWarnings("unused")
public class AmplifierImpl implements Amplifier {
	
	
	private Tunner tunner;
	private DvdPlayer dvdPlayer;
	private CdPlayer cdPlayer;

	@Override
	public void on() {
		System.out.println("AmplifierImpl on");
	}

	@Override
	public void off() {
		System.out.println("AmplifierImpl off");
	}

	@Override
	public void setCd(CdPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

	@Override
	public void setDvd(DvdPlayer dvdPayer) {
		this.dvdPlayer = dvdPayer;
	}

	@Override
	public void setTunner(Tunner tunner) {
		this.tunner = tunner;
	}
	
	@Override
	public void setSurroundAudio() {
		dvdPlayer.setSurroundAudio();
	}

	@Override
	public void setTwoChannelAudio() {
		dvdPlayer.setTwoChannelAudio();
	}

	@Override
	public void setVolume(int volume) {
		System.out.println(String.format("AmplifierImpl volume to %s", volume));
	}
	
}