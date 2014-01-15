package decorator.starbuzz.beverage.coffees;

import decorator.starbuzz.beverage.Beverage;

public class Decaf extends Beverage {

	public Decaf(){
		description = "Decaf";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}
}