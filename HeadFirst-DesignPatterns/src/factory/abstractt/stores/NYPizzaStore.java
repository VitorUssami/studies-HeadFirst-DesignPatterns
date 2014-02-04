package factory.abstractt.stores;

import factory.abstractt.factories.NYPizzaIngredientFactory;
import factory.abstractt.factories.PizzaIngredientFactory;
import factory.abstractt.pizzas.CheesePizza;
import factory.abstractt.pizzas.ClamPizza;
import factory.abstractt.pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {
	
	
	private PizzaIngredientFactory factory;
	
	
	public NYPizzaStore(){
		factory = new NYPizzaIngredientFactory();
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
		pizza.setCity("NY");
		pizza.prepare();
		return pizza;
	}

}