package patternsOfPatterns.duckSimulator.counter;

import patternsOfPatterns.duckSimulator.animals.Quackable;
import patternsOfPatterns.duckSimulator.observer.Observer;

public class QuackCounter implements Quackable {

	private static int numberOfQuacks;
	
	private Quackable duck;

	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
	
	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}

	/**
	 * @return the numberOfQuacks
	 */
	public static int getNumberOfQuacks() {
		return numberOfQuacks;
	}

	@Override
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		duck.notifyObservers();
	}
}
