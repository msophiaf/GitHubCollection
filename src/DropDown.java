import java.awt.Component;

import javax.swing.JOptionPane;

public class DropDown{
	public static void main(String[] args)
	{
		
	}
Object[] possibilities = {"pigs", "wigs", "jigs", "gigs", "rigs",};
private Component frame;
String s = (String)JOptionPane.showInputDialog(
                    frame,
                    "Complete the sentence:\n"
                    + "\"Pigs and...\"",
                    "Customized Dialog",
                    JOptionPane.PLAIN_MESSAGE,
                    icon,
                    possibilities,
                    "ham");

//If a string was returned, say so.
if ((s != null) && (s.length() > 0)) {
    setLabel("Pigs and... " + s + "!");
    return;
}

//If you're here, the return value was null/empty.
setLabel("Come on, finish the sentence!");
}