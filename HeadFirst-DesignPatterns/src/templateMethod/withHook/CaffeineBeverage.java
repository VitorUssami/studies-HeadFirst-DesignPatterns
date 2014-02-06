package templateMethod.withHook;

public abstract class CaffeineBeverage {
	
	public abstract void brew();
	
	public abstract void addCondiments();
	
	
	public final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}	
	}
	
	public void boilWater(){
		System.out.println("Boiling water..");
	}
	
	public void pourInCup(){
		System.out.println("pouring into cup");
	}
	
	public boolean customerWantsCondiments(){
		return true;
	}
}