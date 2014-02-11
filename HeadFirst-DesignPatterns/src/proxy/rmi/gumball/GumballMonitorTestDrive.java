package proxy.rmi.gumball;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
	
	public static void main(String[] args) {
		try{
			GumballMachineRemote service1 = (GumballMachineRemote)Naming.lookup("rmi://127.0.0.1:1099/Location1/gumballmachine");
			new GumballMonitor(service1).report();
			
			GumballMachineRemote service2 = (GumballMachineRemote)Naming.lookup("rmi://127.0.0.1:1099/Location2/gumballmachine");
			new GumballMonitor(service2).report();
			
			GumballMachineRemote service3 = (GumballMachineRemote)Naming.lookup("rmi://127.0.0.1:1099/Location3/gumballmachine");
			new GumballMonitor(service3).report();
		}catch(Exception e){
			
		}
	}
}