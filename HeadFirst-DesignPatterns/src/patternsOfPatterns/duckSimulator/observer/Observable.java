package patternsOfPatterns.duckSimulator.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable {

	private List<Observer> observers;
	private QuackObservable duck;
	
	
	public Observable(QuackObservable duck){
		this.duck = duck;
		observers = new ArrayList<Observer>();
		
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		for (Iterator<Observer> iterator = observers.iterator(); iterator
				.hasNext();) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}
}
