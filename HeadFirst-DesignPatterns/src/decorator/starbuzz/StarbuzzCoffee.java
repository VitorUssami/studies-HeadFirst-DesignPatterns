package decorator.starbuzz;

import decorator.starbuzz.beverage.Beverage;
import decorator.starbuzz.beverage.coffees.Expresso;
import decorator.starbuzz.beverage.coffees.HouseBlend;
import decorator.starbuzz.beverage.condiments.Mocha;
import decorator.starbuzz.beverage.condiments.Soy;
import decorator.starbuzz.beverage.condiments.Whip;

public class StarbuzzCoffee {
	
	public static void main(String[] args) {
		
		Beverage beverage = new Expresso();
		System.out.println(beverage.getDescription() + " $ " + beverage.cost());
		System.out.println();
		
		Beverage beverage2 = new Expresso();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());
		System.out.println();
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());
		
	}
}
