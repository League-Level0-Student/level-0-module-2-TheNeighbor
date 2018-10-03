package extra;

import javax.swing.JOptionPane;

public class CitationMachine {
public static void main(String[] args) {
String Author = JOptionPane.showInputDialog("Type in the author's last name, first name, and middle name (if any).");
String Atitle = JOptionPane.showInputDialog("Type in the article title in quotes.");
String Wtitle = JOptionPane.showInputDialog("Type in the website title.");
String Publisher = JOptionPane.showInputDialog("Type in the publisher/sponsor.");
String DateP = JOptionPane.showInputDialog("Type in when the website was published.");
String URL = JOptionPane.showInputDialog("Type in the URL.");
String DateA = JOptionPane.showInputDialog("Type in when you accessed the website.");
JOptionPane.showMessageDialog(null, Author + ". " + Atitle + ". " + Wtitle + ", " + Publisher + "," + '\n' + DateP + ", " + URL + ". " + "Accessed " + DateA + ". ");
}
}
