package factory.abstractt.stores;

import factory.abstractt.factories.ChicagoPizzaIngredientFactory;
import factory.abstractt.factories.PizzaIngredientFactory;
import factory.abstractt.pizzas.CheesePizza;
import factory.abstractt.pizzas.ClamPizza;
import factory.abstractt.pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
	
	
	private PizzaIngredientFactory factory;
	
	
	public ChicagoPizzaStore(){
		factory = new ChicagoPizzaIngredientFactory();
	}

	public Pizza createPizza(PizzaStore.PizzaEnum type) {

		Pizza pizza;

		switch (type) {
			case Cheese:
				pizza = new CheesePizza(factory);
				break;
			case Clam:
				pizza = new ClamPizza(factory);
				break;
			default:
				throw new IllegalArgumentException();
		}
		pizza.setCity("Chicago");
		pizza.prepare();
		return pizza;
	}

}