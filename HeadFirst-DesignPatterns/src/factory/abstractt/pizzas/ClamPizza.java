package factory.abstractt.pizzas;

import factory.abstractt.factories.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

	
	private PizzaIngredientFactory factory;
	
	
	public ClamPizza(PizzaIngredientFactory factory){
		setName("Clam Pizza");
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