package proxy.rmi.gumball.states;

import java.rmi.RemoteException;

import proxy.rmi.gumball.GumballMachine;

public class SoldState implements State {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4070791983546495148L;
	private transient GumballMachine gumballMachine;
	
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
		try {
			gumballMachine.releaseBall();
			if(gumballMachine.getCount() > 0){
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			}else{
				System.out.println("Oops out of gumballs");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
