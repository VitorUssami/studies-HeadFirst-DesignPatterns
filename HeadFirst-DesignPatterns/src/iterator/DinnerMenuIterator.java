package iterator;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator<MenuItem> {

	private MenuItem[] items;
	private int position;
	
	public DinnerMenuIterator(MenuItem[] items){
		this.items = items;
		position = 0;
	}
	
	
	@Override
	public boolean hasNext() {
		
		if(position >= items.length || items[position] == null){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public MenuItem next() {
		return items[position++];
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("TODO");
	}
}