package templateMethod.withHook;

import javax.swing.JOptionPane;

public class Tea extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding lemon");
	}
	
	/* (non-Javadoc)
	 * @see templateMethod.withHook.CaffeineBeverage#customerWantsCondiments()
	 */
	@Override
	public boolean customerWantsCondiments() {
		return "y".equalsIgnoreCase(JOptionPane.showInputDialog(null,
				"Would you like lemon with your tea (y/n)?",
				"Condiments", JOptionPane.QUESTION_MESSAGE));
	}
}