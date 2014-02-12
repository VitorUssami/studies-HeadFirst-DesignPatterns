package patternsOfPatterns.duckSimulator;

import patternsOfPatterns.duckSimulator.animals.Flock;
import patternsOfPatterns.duckSimulator.factories.AbstractDuckFactory;
import patternsOfPatterns.duckSimulator.factories.DuckFactory;
import patternsOfPatterns.duckSimulator.observer.Quackologist;

public class DuckSimulator {
	
	public static void main(String[] args) {
		
		AbstractDuckFactory factory = new DuckFactory();
		
		Flock flock = new Flock();
		
		flock.add(factory.createDuckCall());
		flock.add(factory.createMallardDuck());
		flock.add(factory.createRubberDuck());
		flock.add(factory.creatRedHeadDuck());
		
		Quackologist quackologist = new Quackologist();
		flock.registerObserver(quackologist);
		
		flock.quack();
	}
}