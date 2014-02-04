package factory.method;

public class Main {
	
	
	public static void main(String[] args) {
		
		PizzaStore store = new NYPizzaStore();
		Pizza pizza = store.createPizza(PizzaEnum.Cheese);
		System.out.println(pizza.getClass().getSimpleName());
		System.out.println();
		
		store = new ChicagoPizzaStore();
		pizza = store.createPizza(PizzaEnum.Cheese);
		System.out.println(pizza.getClass().getSimpleName());
		System.out.println();
	}
}