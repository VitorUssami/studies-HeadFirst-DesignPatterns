package factory.abstractt.factories;

import factory.abstractt.ingredients.cheese.Cheese;
import factory.abstractt.ingredients.clams.Clams;
import factory.abstractt.ingredients.dough.Dough;
import factory.abstractt.ingredients.sauce.Sauce;

public interface PizzaIngredientFactory {
	
	Cheese createCheese();
	Clams createClam();
	Dough createDough();
	Sauce createSauce();

}