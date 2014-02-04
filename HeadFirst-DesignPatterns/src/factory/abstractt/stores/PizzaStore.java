package factory.abstractt.stores;

import factory.abstractt.pizzas.Pizza;

public abstract class PizzaStore {
	
	public abstract Pizza createPizza(PizzaEnum type);
	
	public enum PizzaEnum{
		
		Cheese,Clam;
	}
}
