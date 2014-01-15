package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SwingObserverExample {
	
	public void go(){
		JFrame frame = new JFrame();
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(button);
		frame.setSize(100,100);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	class AngelListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Dont do it, you might regret it!");
		}
		
	}
	class DevilListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Come on, do it!");
		}
		
	}
	
	public static void main(String[] args) {
		new SwingObserverExample().go();
	}
}
