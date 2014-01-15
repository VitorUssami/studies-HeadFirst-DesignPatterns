package decorator.starbuzz.beverage.coffees;

import decorator.starbuzz.beverage.Beverage;

public class Expresso extends Beverage {

	public Expresso(){
		description = "Expresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}
}
