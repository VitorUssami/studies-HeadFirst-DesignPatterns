package proxy.rmi.gumball;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class GumballMachineTestDrive {
	
	public static void main(String[] args) {
		
		try{
			
			LocateRegistry.createRegistry(1099);
			
			GumballMachine machine1 = new GumballMachine("Location1", 1);
			GumballMachine machine2 = new GumballMachine("Location2", 2);
			GumballMachine machine3 = new GumballMachine("Location3", 3);
			
			Naming.rebind(machine1.getLocation().concat("/gumballmachine"), machine1);
			Naming.rebind(machine2.getLocation().concat("/gumballmachine"), machine2);
			Naming.rebind(machine3.getLocation().concat("/gumballmachine"), machine3);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
