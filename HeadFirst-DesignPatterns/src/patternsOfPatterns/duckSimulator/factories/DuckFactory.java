package patternsOfPatterns.duckSimulator.factories;

import patternsOfPatterns.duckSimulator.animals.Quackable;
import patternsOfPatterns.duckSimulator.animals.ducks.impl.DuckCall;
import patternsOfPatterns.duckSimulator.animals.ducks.impl.MallardDuck;
import patternsOfPatterns.duckSimulator.animals.ducks.impl.RedheaddDuck;
import patternsOfPatterns.duckSimulator.animals.ducks.impl.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable creatRedHeadDuck() {
		return new RedheaddDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
