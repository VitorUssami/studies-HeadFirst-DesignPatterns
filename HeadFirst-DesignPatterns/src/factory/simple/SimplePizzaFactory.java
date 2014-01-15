package factory.simple;

public class SimplePizzaFactory {

	public SimplePizza createPizza(String type) {

		SimplePizza pizza = null;
		if ("cheese".equals(type)) {
			pizza = new SimpleCheesePizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new SimplePepperoniPizza();
		} else if ("clam".equals(type)) {
			pizza = new SimpleClamPizza();
		} else if ("veggie".equals(type)) {
			pizza = new SimpleVeggiePizza();
		}
		return pizza;
	}
}
