package factory.simple;

public class SimplePizza {

	public void prepare() {
		System.out.println("\t prepare");
	}

	public void bake() {
		System.out.println("\t bake");
	}

	public void cut() {
		System.out.println("\t cut");
	}

	public void box() {
		System.out.println("\t box");
	}
}

class SimpleCheesePizza extends SimplePizza {
}

class SimplePepperoniPizza extends SimplePizza {
}

class SimpleClamPizza extends SimplePizza {
}

class SimpleVeggiePizza extends SimplePizza {
}
