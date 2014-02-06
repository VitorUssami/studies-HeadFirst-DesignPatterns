package templateMethod.withHook;

import javax.swing.JOptionPane;

public class Coffee extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Dripping coffe through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding sugar and milk");
	}

	/* (non-Javadoc)
	 * @see templateMethod.withHook.CaffeineBeverage#customerWantsCondiments()
	 */
	@Override
	public boolean customerWantsCondiments() {
		return "y".equalsIgnoreCase(JOptionPane.showInputDialog(null,
				"Would you like milk and sugar with your coffe (y/n)?",
				"Condiments", JOptionPane.QUESTION_MESSAGE));
	}
}
