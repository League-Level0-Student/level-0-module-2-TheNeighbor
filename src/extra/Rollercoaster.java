package extra;

import javax.swing.JOptionPane;

public class Rollercoaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String height = JOptionPane.showInputDialog("How tall are you. (in inches)");
		int h = Integer.parseInt(height);
		if (h > 48) {
			JOptionPane.showInputDialog("You must go on the rollercoaster or I will push you!");
		} else {
			JOptionPane.showMessageDialog(null, "Ask your mom to plant you and water you so you will grow some more.");
		}
	}

}
