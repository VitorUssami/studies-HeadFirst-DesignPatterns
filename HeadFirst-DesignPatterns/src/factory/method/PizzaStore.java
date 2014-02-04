package factory.method;

public abstract class PizzaStore {
	
	abstract Pizza createPizza(PizzaEnum type);
	
}

enum PizzaEnum{
	
	Cheese,Pepperoni,Clam,Veggie;
}