package iterator;

import java.util.Iterator;

public class DinnerMenu implements Menu{

	private final int MAX_ITEMS = 4;
	private int numberOfItems;
	private MenuItem[] menuItems;
	
	
	public DinnerMenu(){
		numberOfItems = 0;
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Vegetarian BLT", "Vegetarian BLT bla bla bla", true, 2.99);
		addItem("BLT", "BLT bla bla bla", false, 2.99);
		addItem("Soup of the day", "Soup of the day bla bla bla", false, 3.30);
		addItem("Hotdog", "Hotdog bla bla bla", false, 3.0);
	}
	
	private void addItem(String name, String description, boolean vegetarian,
			double price) {
		
		if(numberOfItems >= MAX_ITEMS){
			System.err.println("Sorry, menu is full !");
		}else{
			menuItems[numberOfItems++] = new MenuItem(name, description,
					vegetarian, price);
		}
	}
	
	@Override
	public Iterator<MenuItem> createIterator() {
		return new DinnerMenuIterator(menuItems);
	}
}