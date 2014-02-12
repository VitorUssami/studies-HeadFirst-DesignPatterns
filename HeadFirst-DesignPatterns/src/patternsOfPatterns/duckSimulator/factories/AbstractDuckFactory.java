package patternsOfPatterns.duckSimulator.factories;

import patternsOfPatterns.duckSimulator.animals.Quackable;

public abstract class AbstractDuckFactory {

	public abstract Quackable createMallardDuck();

	public abstract Quackable creatRedHeadDuck();

	public abstract Quackable createDuckCall();

	public abstract Quackable createRubberDuck();
}