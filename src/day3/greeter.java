package day3;

import javax.swing.JOptionPane;

public class greeter {
	public static void main(String[] args) {
		
		String answer= JOptionPane.showInputDialog(null, "Credit card info");
		JOptionPane.showMessageDialog(null, "GIMME YOUR MONEY!!!!"+ "this isn't your credit card number"+ answer);
		JOptionPane.showMessageDialog(null, "you'd better give the information or else...");
		
	}

}
