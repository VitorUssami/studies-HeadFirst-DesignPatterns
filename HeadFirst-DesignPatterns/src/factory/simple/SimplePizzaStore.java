package factory.simple;

public class SimplePizzaStore {

	private SimplePizzaFactory factory;

	public SimplePizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public SimplePizza orderPizza(String type) {

		SimplePizza pizza;
		pizza = factory.createPizza(type);
		System.out.println("orderPizza: "+ pizza.getClass().getSimpleName());
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
