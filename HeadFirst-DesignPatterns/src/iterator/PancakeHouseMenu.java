package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu{

	private List<MenuItem> menuItems;
	
	public PancakeHouseMenu(){
		
		menuItems = new ArrayList<MenuItem>();
		addItem("K&B Pancake breakfast","pancakes with scrembled eggs and toast",true,2.99);
		addItem("Regular Pancake breakfast","pancakes with fried eggs, sausage",false,2.99);
		addItem("Blueberry Pancake","pancakes with fresh blueberries",true,3.50);
		addItem("Waffles","Waffles",true,3.60);
	}
	
	private void addItem(String name, String description, boolean vegetarian,
			double price) {
		menuItems.add(new MenuItem(name, description, vegetarian, price));
	}
	
	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
}
