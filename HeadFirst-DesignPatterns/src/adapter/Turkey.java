package adapter;

public interface Turkey {
	
	public void gobble();
	public void fly();
}


class Wildturkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("gobble gobble");
	}

	@Override
	public void fly() {
		System.out.println("Im flying a short distance");
	}
	
}