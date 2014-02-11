package proxy.dynamic.protection;

import java.lang.reflect.Proxy;

public class MatchMakingMachineTestDrive {
	
	
	
	
	private PersonBean getOwnerProxy(PersonBean person){
		return (PersonBean) Proxy.newProxyInstance(person.getClass()
				.getClassLoader(), person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
	}
	
	private PersonBean getNonOwnerProxy(PersonBean person){
		return (PersonBean) Proxy.newProxyInstance(person.getClass()
				.getClassLoader(), person.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(person));
	}
	
	private PersonBean getPerson(String name){
		
		PersonBean person = new PersonBeanImpl();
		person.setName(name);
		person.setHotOrNotRating(((int)(Math.random() * 100)));
		return person;
	}
	
	public void drive(){
		
		PersonBean joe = getPerson("Joe JavaBean");
		
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println(String.format("Name is %s", ownerProxy.getName()));
		ownerProxy.setInterests("Bowling, go");
		
		try{
			ownerProxy.setHotOrNotRating(100);
		}catch(Exception e){
			System.out.println("Cant set rating from owner proxy");
		}
		System.out.println(String.format("Rating is %s", ownerProxy.getHotOrNotRating()));
		
		
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println(String.format("\nName is %s", nonOwnerProxy.getName()));
		try{
			nonOwnerProxy.setInterests("Bowling, go");
		}catch(Exception e){
			System.out.println("Cant set Interests from non owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(10);
		System.out.println(String.format("Rating is %s", nonOwnerProxy.getHotOrNotRating()));
	}
	
	public static void main(String[] args) {
		new MatchMakingMachineTestDrive().drive();
	}
}
