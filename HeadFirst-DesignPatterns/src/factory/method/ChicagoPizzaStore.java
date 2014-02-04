package factory.method;

public class ChicagoPizzaStore extends PizzaStore {

	public Pizza createPizza(PizzaEnum type) {

		Pizza pizza;

		switch (type) {
			case Cheese:
				pizza = new ChicagoStyleCheesePizza();
				break;
			case Pepperoni:
				pizza = new ChicagoStylePepperoniPizza();
				break;
			case Clam:
				pizza = new ChicagoStyleClamPizza();
				break;
			case Veggie:
				pizza = new ChicagoStyleVeggiePizza();
				break;
			default:
				throw new IllegalArgumentException();
		}
		return pizza;
	}

}