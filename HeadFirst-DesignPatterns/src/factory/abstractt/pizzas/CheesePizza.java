package factory.abstractt.pizzas;

import factory.abstractt.factories.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

	
	private PizzaIngredientFactory factory;
	
	
	public CheesePizza(PizzaIngredientFactory factory){
		setName("Cheese Pizza");
		this.factory = factory;
	}
	
	@Override
	public void prepare() {
		System.out.println(String.format("Preparing %s" , getName()));
		setCheese(factory.createCheese());
		setClam(factory.createClam());
		setDough(factory.createDough());
		setSauce(factory.createSauce());
	}
}