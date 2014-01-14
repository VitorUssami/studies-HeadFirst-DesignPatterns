package strategy;

import strategy.behavior.quack.Squeak;
import strategy.client.Duck;
import strategy.client.MallardDuck;

public class MiniDucksSimulator {


	public static void main(String[] args) {
		
		Duck duck = new MallardDuck();
		duck.performQuack();
		duck.performFly();
		
		duck.setQuackBehavior(new Squeak());
		duck.performQuack();
	}
}