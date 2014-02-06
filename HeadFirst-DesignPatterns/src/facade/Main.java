package facade;

import facade.interfaces.impl.AmplifierImpl;
import facade.interfaces.impl.CdPlayerImpl;
import facade.interfaces.impl.DvdPlayerImpl;
import facade.interfaces.impl.PopcornPopperImpl;
import facade.interfaces.impl.ProjectorImpl;
import facade.interfaces.impl.ScreenImpl;
import facade.interfaces.impl.TheaterLightsImpl;
import facade.interfaces.impl.TunnerImpl;

public class Main {
	
	
	public static void main(String[] args) {
		HomeTheaterFacade facade = new HomeTheaterFacade(new AmplifierImpl(),
				new TunnerImpl(), new DvdPlayerImpl(), new CdPlayerImpl(),
				new ProjectorImpl(), new TheaterLightsImpl(), new ScreenImpl(),
				new PopcornPopperImpl());
		
		
		facade.watchMovie();
		System.out.println();
		facade.endMovie();
	}
}