package factory.abstractt.factories;

import factory.abstractt.ingredients.cheese.Cheese;
import factory.abstractt.ingredients.cheese.MozzarelaCheese;
import factory.abstractt.ingredients.clams.Clams;
import factory.abstractt.ingredients.clams.FrozenClams;
import factory.abstractt.ingredients.dough.Dough;
import factory.abstractt.ingredients.dough.ThickCrustDough;
import factory.abstractt.ingredients.sauce.PlumTomatoSauce;
import factory.abstractt.ingredients.sauce.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Cheese createCheese() {
		return new MozzarelaCheese();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}
}