package patternsOfPatterns.duckSimulator.observer;


public interface QuackObservable {
	
	void registerObserver(Observer observer);
	
	void notifyObservers();
}
