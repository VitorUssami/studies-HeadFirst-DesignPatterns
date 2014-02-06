package composite;

public class MenuItem extends MenuComponent {
	
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	
	
	public MenuItem(String name, String description, boolean vegetarian,
			double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public boolean isVegetarian() {
		return vegetarian;
	}

	@Override
	public void print() {
		System.out.println(String.format("%s %s, %s -- %s", getName(),
				(isVegetarian() ? "(v)" : ""), getPrice(), getDescription()));
	}
	
}