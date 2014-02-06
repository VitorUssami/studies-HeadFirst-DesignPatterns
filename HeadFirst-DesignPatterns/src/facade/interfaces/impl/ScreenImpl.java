package facade.interfaces.impl;

import facade.interfaces.Screen;

public class ScreenImpl implements Screen {

	@Override
	public void up() {
		System.out.println("ScreenImpl up");
	}

	@Override
	public void down() {
		System.out.println("ScreenImpl down");		
	}
}