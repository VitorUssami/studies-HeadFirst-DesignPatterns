package proxy.rmi.gumball.states;

import proxy.rmi.gumball.GumballMachine;

public class NoQuarterState implements State {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5415034929522702003L;
	private transient GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You havent inserted a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there is no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}
}
