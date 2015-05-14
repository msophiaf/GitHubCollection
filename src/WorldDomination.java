import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		//Custom button text
		Object[] options = {"Yes, I do.",
		                    "No, I do not.",
		                    "Don't rub it in! I feel no need to answer the question!"};
		int n = JOptionPane.showOptionDialog(null,
		    "Do you know how to write code? ",
		    
		    "A Silly Question",
		    JOptionPane.YES_NO_CANCEL_OPTION,
		    JOptionPane.QUESTION_MESSAGE,
		    null,
		    options,
		    options[2]); 

		// 2. If they say "yes", tell them they will rule the world.
		if(n==)
		//if(.equals("yes")){}
		//JOptionPane.showInputDialog(null,"")

		// 3. Otherwise, wish them good luck washing dishes.

	}
}
