package decorator.starbuzz.beverage.coffees;

import decorator.starbuzz.beverage.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend(){
		description = "House Blend Coffee ";
	}
	
	@Override
	public double cost() {
		return 0.89;
	}
}
