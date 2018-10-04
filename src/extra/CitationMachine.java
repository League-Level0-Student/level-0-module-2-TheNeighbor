package extra;

import javax.swing.JOptionPane;

public class CitationMachine {
public static void main(String[] args) {
String Author = JOptionPane.showInputDialog("Type in the author's last name and first name with a comma before the last name.");
String Atitle = JOptionPane.showInputDialog("Type in the article title in quotes with a period before the end quotes.");
String Wtitle = JOptionPane.showInputDialog("Type in the website title.");
String Page = JOptionPane.showInputDialog("Type in the page or paragraph number that you got the information from. Use the abbreviation p. for page and par. for paragraph.");
String URL = JOptionPane.showInputDialog("Type in the URL.");
String DateA = JOptionPane.showInputDialog("Type in when you accessed the website.");
JOptionPane.showMessageDialog(null, Author + ". " + Atitle + Wtitle + ", " + Page + "," + '\n' + URL + ". " + "Accessed " + DateA + ". ");
}
}
