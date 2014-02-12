package patternsOfPatterns.duckSimulator.factories;

import patternsOfPatterns.duckSimulator.animals.Quackable;
import patternsOfPatterns.duckSimulator.animals.ducks.impl.DuckCall;
import patternsOfPatterns.duckSimulator.animals.ducks.impl.MallardDuck;
import patternsOfPatterns.duckSimulator.animals.ducks.impl.RedheaddDuck;
import patternsOfPatterns.duckSimulator.animals.ducks.impl.RubberDuck;
import patternsOfPatterns.duckSimulator.counter.QuackCounter;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable creatRedHeadDuck() {
		return new QuackCounter(new RedheaddDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}