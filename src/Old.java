import javax.swing.JOptionPane;

public class Old {
	public static void main(String[] args) {

		String age = JOptionPane.showInputDialog("How old are you?");
		int num = Integer.parseInt(age);
		if (num > 17) {
			JOptionPane.showInputDialog("Who should be the next president");
		}
		if (num < 18) {
			JOptionPane.showInputDialog("No one cares bout you!");

		}
	}
}
