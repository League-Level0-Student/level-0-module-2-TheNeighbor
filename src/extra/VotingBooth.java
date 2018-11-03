package extra;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("What is your age?");
		int a = Integer.parseInt(age);
		if (a >= 18) {
			JOptionPane.showInputDialog("Who should the next president be?");
		} else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
		}
	}
}
