package iterator;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {

	private Map<String,MenuItem> menuItems;
	
	public CafeMenu(){
		menuItems = new Hashtable<String,MenuItem>();
		addItem("Veggie Burger and air fries", "Veggie Burger and air fries la la la", true, 4.50);
		addItem("Soup of the day", "Soup of the day la la la", false, 2.50);
		addItem("Burrito", "Burrito la la la", true, 4.50);
		
	}
	
	private void addItem(String name, String description, boolean vegetarian,
			double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}
	
	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}
}