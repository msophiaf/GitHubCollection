import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 22;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
		String answer = JOptionPane.showInputDialog(null,
				"What has a face and two hands but no arms or legs?");

		if (answer.equals("a clock")) {
			// 4. If they got the answer right, pop up "correct!" and increase
			// the score by one
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;

		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null,
					"Incorrect! I'm sorry, but the answer is a clock!");
			score--;
			// 6. Add some more riddles
			String power = JOptionPane
					.showInputDialog(
							null,
							"What is lighter than a feather, but even the strongest man alive couldn't hold it for more than two minutes?");

			if (power.equals("your breath")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score++;
			} else {
				JOptionPane.showMessageDialog(null,
						"Incorrect! I'm sorry, but the answer is your breath!");
				score--;

			}
		}
	}
}
