package proxy.rmi.simple;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3833201104362076832L;

	protected MyRemoteImpl() throws RemoteException {
	}

	@Override
	public String sayHello() throws RemoteException {
		return "Server says Hello";
	}
	
	public static void main(String[] args) {
		MyRemote service;
		try {
			//nao funciona
//			Runtime.getRuntime().exec("rmiregistry");
			
			// comando para 'substituir' o 'rmiregistry'
			LocateRegistry.createRegistry(1099);
			service = new MyRemoteImpl();
			Naming.rebind("RemoteHello",service);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}