package hust.soict.globalict.lab01.javabasics;
import javax.swing.JOptionPane;

public class ChoosingOption {
	public static void main(String[] args) {
		Object[] config = {"I Do", "I Don't"};
		
		int option = JOptionPane.showOptionDialog(null, "Do you want to change to the first class ticket?", null, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, config, null);
		
		JOptionPane.showMessageDialog(null, "You've chosen: " + (option==JOptionPane.YES_OPTION?config[0]:config[1]));
		
		System.exit(0);
	}
}
