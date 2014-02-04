package factory.abstractt.pizzas;

import factory.abstractt.ingredients.cheese.Cheese;
import factory.abstractt.ingredients.clams.Clams;
import factory.abstractt.ingredients.dough.Dough;
import factory.abstractt.ingredients.sauce.Sauce;

public abstract class Pizza {
	
	private String name;
	private String city;
	private Dough dough;
	private Sauce sauce;
	private Cheese cheese;
	private Clams clam;
	
	
	
	public abstract void prepare();
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the dough
	 */
	public Dough getDough() {
		return dough;
	}
	/**
	 * @param dough the dough to set
	 */
	public void setDough(Dough dough) {
		this.dough = dough;
	}
	/**
	 * @return the sauce
	 */
	public Sauce getSauce() {
		return sauce;
	}
	/**
	 * @param sauce the sauce to set
	 */
	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}
	/**
	 * @return the cheese
	 */
	public Cheese getCheese() {
		return cheese;
	}
	/**
	 * @param cheese the cheese to set
	 */
	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}
	/**
	 * @return the clam
	 */
	public Clams getClam() {
		return clam;
	}
	/**
	 * @param clam the clam to set
	 */
	public void setClam(Clams clam) {
		this.clam = clam;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", city=" + city + ", dough=" + dough
				+ ", sauce=" + sauce + ", cheese=" + cheese + ", clam=" + clam
				+ "]";
	}
}