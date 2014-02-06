package facade.interfaces.impl;

import facade.interfaces.PopcornPopper;

public class PopcornPopperImpl implements PopcornPopper {

	@Override
	public void on() {
		System.out.println("PopcornPopperImpl on");
	}

	@Override
	public void off() {
		System.out.println("PopcornPopperImpl off");
	}

	@Override
	public void pop() {
		System.out.println("PopcornPopperImpl pop");
	}
}