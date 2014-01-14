package strategy.client;

import strategy.behavior.fly.FlyWithWings;
import strategy.behavior.quack.Quack;

public class MallardDuck extends Duck{

	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("Im a real mallard duck");
	}


}