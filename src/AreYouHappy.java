import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

		String q = JOptionPane.showInputDialog("Are you happy? yes or no");

		if (q.equals("yes")) {
			JOptionPane.showMessageDialog(null,
					"Keep doing whatever you are doing.");
		} else if(q.equals("no")) {
			String want = JOptionPane
					.showInputDialog("Do you want to be happy?");

			if (want.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			} else if(want.equals("no")) {
				JOptionPane.showMessageDialog(null,
						"Keep doing whatever you are doing.");
			}
			else{
				JOptionPane.showMessageDialog(null, "That was not a choice. Sorry.");
			}
		}

	}
}
