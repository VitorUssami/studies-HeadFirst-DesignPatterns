package strategy.client;

import strategy.behavior.fly.FlyBehavior;
import strategy.behavior.quack.QuackBehavior;

public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public Duck(){}
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("swim");
	}
	
}