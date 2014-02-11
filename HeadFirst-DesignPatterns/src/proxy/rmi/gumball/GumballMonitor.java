package proxy.rmi.gumball;

import java.rmi.RemoteException;

public class GumballMonitor {
	
	private GumballMachineRemote machine;
	private final String report = "**********\n Gumball machine: %s\nCurrent inventory: %s\nCurrent State: %s\n**********";

	public GumballMonitor(GumballMachineRemote machine) {
		this.machine = machine;
	}
	
	public void report(){
		try{
			System.out.println(String.format(report, machine.getLocation(),
					machine.getCount(), machine.getState()));
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}
}
