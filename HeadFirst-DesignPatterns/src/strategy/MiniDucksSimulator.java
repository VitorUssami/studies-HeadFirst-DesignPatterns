package strategy;

import strategy.client.Duck;
import strategy.client.MallardDuck;

public class MiniDucksSimulator {


	public static void main(String[] args) {
		
		Duck duck = new MallardDuck();
		duck.performQuack();
		duck.performFly();
		
	}
}