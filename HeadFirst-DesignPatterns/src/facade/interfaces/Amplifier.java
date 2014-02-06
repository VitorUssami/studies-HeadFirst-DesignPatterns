package facade.interfaces;

public interface Amplifier {
	
	void on();
	void off();
	void setCd(CdPlayer cdPlayer);
	void setDvd(DvdPlayer dvdPayer);
	void setSurroundAudio();
	void setTwoChannelAudio();
	void setTunner(Tunner tunner);
	void setVolume(int volume);
	
}
