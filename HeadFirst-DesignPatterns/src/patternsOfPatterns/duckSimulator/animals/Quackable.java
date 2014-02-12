package patternsOfPatterns.duckSimulator.animals;

import patternsOfPatterns.duckSimulator.observer.QuackObservable;

public interface Quackable extends QuackObservable{
	
	void quack();
}
