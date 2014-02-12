package patternsOfPatterns.duckSimulator.animals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import patternsOfPatterns.duckSimulator.observer.Observer;

public class Flock implements Quackable {

	private List<Quackable> quackers;
	
	public Flock(){
		quackers = new ArrayList<Quackable>();
	}
	
	
	public void add(Quackable quacker){
		quackers.add(quacker);
	}
	
	
	@Override
	public void quack() {
		
		Iterator<Quackable> it = quackers.iterator();
		while(it.hasNext()){
			it.next().quack();
		}
	}


	@Override
	public void registerObserver(Observer observer) {
		
		Iterator<Quackable> it = quackers.iterator();
		while(it.hasNext()){
			it.next().registerObserver(observer);
		}
	}


	@Override
	public void notifyObservers() {
		
	}
}
