package proxy.rmi.gumball;

import java.rmi.Remote;
import java.rmi.RemoteException;

import proxy.rmi.gumball.states.State;

public interface GumballMachineRemote extends Remote {

	public int getCount() throws RemoteException;

	public String getLocation() throws RemoteException;

	public State getState() throws RemoteException;
}
