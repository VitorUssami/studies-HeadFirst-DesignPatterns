package state;

@SuppressWarnings("unused")
public class SoldOutState implements State {

	private GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, were already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesnt get you another gumball");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
