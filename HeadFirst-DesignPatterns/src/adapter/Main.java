package adapter;

public class Main {
	
	public static void main(String[] args) {
		
		MallardDuck duck = new MallardDuck();
		
		Wildturkey turkey = new Wildturkey();
		
		Duck adapter = new TurkeyAdapter(turkey);
		
		System.out.println("--------- The turkey says --------- ");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("---------  The duck says --------- ");
		testDuck(duck);
		
		System.out.println("---------  The adapter says --------- ");
		testDuck(adapter);
		
	}
	
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}
}