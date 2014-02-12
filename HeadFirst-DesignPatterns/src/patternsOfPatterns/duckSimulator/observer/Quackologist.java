package patternsOfPatterns.duckSimulator.observer;

public class Quackologist implements Observer {

	@Override
	public void update(QuackObservable duck) {
		System.out.println(String.format("Quackologist: %s just quacked", duck
				.getClass().getSimpleName()));
	}
}