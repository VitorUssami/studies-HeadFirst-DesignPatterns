package proxy.rmi.gumball.states;

import java.rmi.RemoteException;

import proxy.rmi.gumball.GumballMachine;

public class WinnerState implements State {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2962671185582513130L;
	private transient GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine){
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
		try {
			System.out.println("YOURE A WINNER ! you get two gumballs for you quarter");
			if(gumballMachine.getCount() == 0){
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}else{
				gumballMachine.releaseBall();
				if(gumballMachine.getCount() > 0){
					gumballMachine.releaseBall();
					gumballMachine.setState(gumballMachine.getNoQuarterState());
				}else{
					System.out.println("Ops, out of gumballs");
					gumballMachine.setState(gumballMachine.getSoldOutState());
				}
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
