package state;

public class SoldState implements State {

	private GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You cant insert a quarter, the machine is sold out");		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You cant eject, you havent inserted a quarter yet");		
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but there are no gumball");		
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() > 0){
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else{
			System.out.println("Oops out of gumballs");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
}
