package factory.abstractt;

import factory.abstractt.pizzas.Pizza;
import factory.abstractt.stores.ChicagoPizzaStore;
import factory.abstractt.stores.NYPizzaStore;
import factory.abstractt.stores.PizzaStore;

public class Main {
	
	
	public static void main(String[] args) {
		
		PizzaStore store = new NYPizzaStore();
		Pizza pizza = store.createPizza(PizzaStore.PizzaEnum.Cheese);
		System.out.println(pizza);
		System.out.println();
		
		store = new ChicagoPizzaStore();
		pizza = store.createPizza(PizzaStore.PizzaEnum.Cheese);
		System.out.println(pizza);
		System.out.println();
	}
}