package patternsOfPatterns.duckSimulator.animals.ducks.impl;

import patternsOfPatterns.duckSimulator.animals.ducks.Duck;
import patternsOfPatterns.duckSimulator.observer.Observable;
import patternsOfPatterns.duckSimulator.observer.Observer;


public class DuckCall extends Duck {
	
	
	private Observable observable;
	
	public DuckCall(){
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("kwack");
		notifyObservers();
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
