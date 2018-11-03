package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		Random random = new Random();
		int r1 = random.nextInt(10);
		int r2 = random.nextInt(10);
		int r3 = random.nextInt(10);
		int r4 = random.nextInt(10);
		int r5 = random.nextInt(10);
		JOptionPane.showMessageDialog(null, r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
	}
}
