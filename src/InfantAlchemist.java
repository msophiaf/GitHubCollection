import java.awt.Component;

import javax.swing.JOptionPane;


public class InfantAlchemist
{
public static void main(String[] args)
{
	//Custom button text
	Object[] options = {"Yes",
	                    "No",
	                    "Haven't tried it"};
	
	int n = JOptionPane.showOptionDialog(null,
	    "Do you like "
	    + "programming??",
	    "A Silly Question",
	    JOptionPane.YES_NO_CANCEL_OPTION,
	    JOptionPane.QUESTION_MESSAGE,
	    null,
	    options,
	    options[2]);
	
	if(n == 2){
		JOptionPane.showMessageDialog(null,"You should. They have a really great class at the league of amazing programmers.");
	}
	if(n == 1){
		JOptionPane.showMessageDialog(null,"You should. If you really don't like it, it is because you have bad judgement.");
	}
	if(n == 0){
		JOptionPane.showMessageDialog(null," Good. That means you are smart.");
}

}}



