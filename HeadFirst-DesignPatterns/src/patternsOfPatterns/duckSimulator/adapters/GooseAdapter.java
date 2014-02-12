package patternsOfPatterns.duckSimulator.adapters;

import patternsOfPatterns.duckSimulator.animals.Quackable;
import patternsOfPatterns.duckSimulator.animals.gooses.Goose;
import patternsOfPatterns.duckSimulator.observer.Observable;
import patternsOfPatterns.duckSimulator.observer.Observer;

public class GooseAdapter implements Quackable{

	private Observable observable;
	private Goose goose;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.honk();
	}


	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
}
