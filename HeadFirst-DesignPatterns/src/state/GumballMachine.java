package state;

public class GumballMachine {

	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State winnerState;
	
	private State state;
	private int count;
	
	public GumballMachine(int numberGumballs){
		state = soldOutState;
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		count = numberGumballs;
		if(count > 0){
			state = noQuarterState;
		}
	}
	
	public void insertQuarter(){
		state.insertQuarter();
	}
	
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public void releaseBall(){
		System.out.println("A gumball comes rolling out the slot..");
		if(count != 0){
			count--;
		}
	}

	/**
	 * @return the soldOutState
	 */
	public State getSoldOutState() {
		return soldOutState;
	}

	/**
	 * @return the noQuarterState
	 */
	public State getNoQuarterState() {
		return noQuarterState;
	}

	/**
	 * @return the hasQuarterState
	 */
	public State getHasQuarterState() {
		return hasQuarterState;
	}

	/**
	 * @return the soldState
	 */
	public State getSoldState() {
		return soldState;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @return the winnerState
	 */
	public State getWinnerState() {
		return winnerState;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GumballMachine [state=" + state + "\n count=" + count + "]";
	}
}
