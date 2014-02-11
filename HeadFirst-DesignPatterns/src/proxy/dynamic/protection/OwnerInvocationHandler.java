package proxy.dynamic.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class OwnerInvocationHandler implements InvocationHandler{

	private PersonBean person;
	
	public OwnerInvocationHandler(PersonBean person){
		this.person = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		try{
			if(method.getName().equals("setHotOrNotRating")){
				throw new IllegalAccessException();
			}else if(method.getName().startsWith("get")
					|| method.getName().startsWith("set")){
				return method.invoke(person, args);
			}
		}catch(InvocationTargetException e){
			e.printStackTrace();
		}
		return null;
	}
	
}
