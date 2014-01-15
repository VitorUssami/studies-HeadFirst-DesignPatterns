package decorator.starbuzz.beverage.coffees;

import decorator.starbuzz.beverage.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast(){
		description = "DarkRoast";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}
}
