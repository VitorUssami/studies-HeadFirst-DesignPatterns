package factory.abstractt.factories;

import factory.abstractt.ingredients.cheese.Cheese;
import factory.abstractt.ingredients.cheese.ReggianoCheese;
import factory.abstractt.ingredients.clams.Clams;
import factory.abstractt.ingredients.clams.FreshClams;
import factory.abstractt.ingredients.dough.Dough;
import factory.abstractt.ingredients.dough.ThinCrustDough;
import factory.abstractt.ingredients.sauce.MarinaraSauce;
import factory.abstractt.ingredients.sauce.Sauce;


public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	

}