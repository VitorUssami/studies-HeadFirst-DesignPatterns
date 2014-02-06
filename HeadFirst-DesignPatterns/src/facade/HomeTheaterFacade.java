package facade;

import facade.interfaces.Amplifier;
import facade.interfaces.CdPlayer;
import facade.interfaces.DvdPlayer;
import facade.interfaces.PopcornPopper;
import facade.interfaces.Projector;
import facade.interfaces.Screen;
import facade.interfaces.TheaterLights;
import facade.interfaces.Tunner;


@SuppressWarnings("unused")
public class HomeTheaterFacade {

	private Amplifier amplifier;
	private Tunner tunner;
	private DvdPlayer dvdPlayer;
	private CdPlayer cdPlayer;
	private Projector projector;
	private TheaterLights theaterLights;
	private Screen screen;
	private PopcornPopper popper;

	public HomeTheaterFacade(Amplifier amplifier, Tunner tunner,
			DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector,
			TheaterLights theaterLights, Screen screen, PopcornPopper popper) {
		this.amplifier = amplifier;
		this.tunner = tunner;
		this.dvdPlayer = dvdPlayer;
		this.cdPlayer = cdPlayer;
		this.projector = projector;
		this.theaterLights = theaterLights;
		this.screen = screen;
		this.popper = popper;
	}

	public void watchMovie() {
		System.out.println("----- HomeTheaterFacade:watchMovie ----- ");
		popper.on();
		popper.pop();
		theaterLights.dim();
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amplifier.on();
		amplifier.setDvd(dvdPlayer);
		amplifier.setSurroundAudio();
		amplifier.setVolume(10);
		dvdPlayer.on();
		dvdPlayer.play();
	}

	public void endMovie() {
		System.out.println("----- HomeTheaterFacade:endMovie ----- ");
		popper.off();
		theaterLights.on();
		screen.up();
		projector.off();
		amplifier.off();
		dvdPlayer.stop();
		dvdPlayer.eject();
		dvdPlayer.off();
	}

}