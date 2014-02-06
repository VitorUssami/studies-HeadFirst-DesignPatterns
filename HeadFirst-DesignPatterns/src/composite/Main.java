package composite;

public class Main {
	
	public static void main(String[] args) {
		
		MenuComponent allMenus = new Menu("All Menus","All menus combined");
		
		MenuComponent dinner = createDinnerHouse();
		dinner.add(createDessertHouse());
		
		allMenus.add(createPancakeHouse());
		allMenus.add(dinner);
		allMenus.add(createCafeHouse());
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
		
	}
	
	private static MenuComponent createPancakeHouse(){
		
		MenuComponent pancacakeHouse = new Menu("Pancake House Menu", "Breakfast");
		pancacakeHouse.add(createItem("Pancake 1", "Pancake 1 description", false, 1.00));
		pancacakeHouse.add(createItem("Pancake 2", "Pancake 2 description", true, 2.00));
		pancacakeHouse.add(createItem("Pancake 3", "Pancake 3 description", false, 3.00));
		
		return pancacakeHouse;
	}
	
	private static MenuComponent createDinnerHouse(){
		
		MenuComponent pancacakeHouse = new Menu("Dinner Menu", "Lunch");
		pancacakeHouse.add(createItem("Dinner 1", "Dinner 1 description", false, 1.00));
		pancacakeHouse.add(createItem("Dinner 2", "Dinner 2 description", true, 2.00));
		pancacakeHouse.add(createItem("Dinner 3", "Dinner 3 description", false, 3.00));
		
		return pancacakeHouse;
	}
	
	private static MenuComponent createCafeHouse(){
		
		MenuComponent pancacakeHouse = new Menu("Cafe Menu", "Dinner");
		pancacakeHouse.add(createItem("Cafe 1", "Cafe 1 description", false, 1.00));
		pancacakeHouse.add(createItem("Cafe 2", "Cafe 2 description", true, 2.00));
		pancacakeHouse.add(createItem("Cafe 3", "Cafe 3 description", false, 3.00));
		
		return pancacakeHouse;
	}
	
	private static MenuComponent createDessertHouse(){
		
		MenuComponent pancacakeHouse = new Menu("Dessert Menu", "Desserts");
		pancacakeHouse.add(createItem("Dessert 1", "Dessert 1 description", false, 1.00));
		pancacakeHouse.add(createItem("Dessert 2", "Dessert 2 description", true, 2.00));
		pancacakeHouse.add(createItem("Dessert 3", "Dessert 3 description", false, 3.00));
		
		return pancacakeHouse;
	}
	
	private static MenuItem createItem(String name, String description, boolean vegetarian,
			double price) {
		return new MenuItem(name, description, vegetarian, price);
	}
}
