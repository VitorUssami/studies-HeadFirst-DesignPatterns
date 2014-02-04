package factory.method;

public class NYPizzaStore extends PizzaStore {

	public Pizza createPizza(PizzaEnum type) {

		Pizza pizza;

		switch (type) {
			case Cheese:
				pizza = new NYStyleCheesePizza();
				break;
			case Pepperoni:
				pizza = new NYStylePepperoniPizza();
				break;
			case Clam:
				pizza = new NYStyleClamPizza();
				break;
			case Veggie:
				pizza = new NYStyleVeggiePizza();
				break;
			default:
				throw new IllegalArgumentException();
		}
		return pizza;
	}

}