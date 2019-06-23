package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
	
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor of popcorn would you like?");
		String time = JOptionPane.showInputDialog("How many minutes will it take to cook?");
		int t = Integer.parseInt(time);
		Popcorn p = new Popcorn(flavor);
		Microwave m = new Microwave();
		m.putInMicrowave(p);
		m.setTime(t); 
		m.startMicrowave();
		p.applyHeat();
		p.eat();
	}
}
