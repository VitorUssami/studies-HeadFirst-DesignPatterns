package factory.simple;

public class Main {
	
	public static void main(String[] args) {
		
		
		SimplePizzaStore store = new SimplePizzaStore(new SimplePizzaFactory());
		
		store.orderPizza("cheese");
		System.out.println();
		
		store.orderPizza("pepperoni");
		System.out.println();
		
		store.orderPizza("clam");
		System.out.println();
		
		store.orderPizza("veggie");
		System.out.println();
	}
}
