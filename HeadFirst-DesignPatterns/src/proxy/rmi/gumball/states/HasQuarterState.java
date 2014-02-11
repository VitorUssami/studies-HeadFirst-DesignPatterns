package proxy.rmi.gumball.states;

import java.rmi.RemoteException;
import java.util.Random;

import proxy.rmi.gumball.GumballMachine;


public class HasQuarterState implements State {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4408797441702589142L;
	private transient GumballMachine gumballMachine;
	private Random randomWinner = new Random(System.currentTimeMillis());
	
	public HasQuarterState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You cant insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		try {
			System.out.println("You turned");
			int winner = randomWinner.nextInt(10);
			if(winner  == 0 && (gumballMachine.getCount() > 1)){
				gumballMachine.setState(gumballMachine.getWinnerState());
			}else{
				gumballMachine.setState(gumballMachine.getSoldState());
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void dispense() {
		System.out.println("No gumbal dispensed");
	}
}
