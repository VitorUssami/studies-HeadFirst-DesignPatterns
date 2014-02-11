package proxy.rmi.simple;

import java.rmi.Naming;

public class MyRemoteClient {
	
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
	
	public void go(){
		try{
			// remover a porta 1099 quando executado pelo 'rmiregistry'
			MyRemote service = (MyRemote)Naming.lookup("rmi://127.0.0.1:1099/RemoteHello");
			System.out.println(service.sayHello());
		}catch(Exception e){
			
		}
	}
}