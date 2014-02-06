package iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Menu> menus = new ArrayList<Menu>(3);
		menus.add(new PancakeHouseMenu());
		menus.add(new DinnerMenu());
		menus.add(new CafeMenu());
		new Waitress(menus).printMenu();
	}
}