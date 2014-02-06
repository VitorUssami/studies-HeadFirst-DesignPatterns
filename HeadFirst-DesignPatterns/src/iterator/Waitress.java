package iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {
	
	private List<Menu> menus;
	
	public Waitress(List<Menu> menus) {
		this.menus = menus;
	}
	
	
	public void printMenu(){
		
		Iterator<Menu> iterator = menus.iterator();
		while(iterator.hasNext()){
			printMenu(iterator.next().createIterator());
		}
	}
	
	private void printMenu(Iterator<MenuItem> iterator){
		
		while(iterator.hasNext()){
			MenuItem menuItem = iterator.next();
			System.out.println(String.format("%s, %s -- %s",
					menuItem.getName(), menuItem.getPrice(),
					menuItem.getDescription()));
		}
	}
	
	
}
