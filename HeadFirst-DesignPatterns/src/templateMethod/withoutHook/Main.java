package templateMethod.withoutHook;

public class Main {
	
	public static void main(String[] args) {
		
		
		CaffeineBeverage beverage = new Tea();
		System.out.println("----- Tea -----");
		beverage.prepareRecipe();
		
		beverage = new Coffee();
		System.out.println("----- Coffee -----");
		beverage.prepareRecipe();
	}
}