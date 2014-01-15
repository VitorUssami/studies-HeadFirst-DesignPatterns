package decorator.starbuzz.beverage;

public abstract class Beverage {
	
	protected String description = "Unknow beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
