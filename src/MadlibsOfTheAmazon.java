import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it..."); 

		
	
				String adjective=JOptionPane.showInputDialog(null, "Enter an adjective");

				String typeofliquid=JOptionPane.showInputDialog(null, "Enter a type of liquid");
				

		
			String bodypart=JOptionPane.showInputDialog(null, "Enter a body part");
				

		
			String verb=JOptionPane.showInputDialog(null, "Enter a verb");

			String place=JOptionPane.showInputDialog(null, "Enter a place");

		JOptionPane.showMessageDialog(null,"Piranhas are more "+adjective+" during the day, so cross the river at "+
		 "night. Piranhas are attracted to fresh "+typeofliquid+" and will most"+
		"\n"+" likely take a bite out of your "+bodypart+" if you are "+verb+". Whatever"+
		 "\n"+" you do, if you have an open wound, try to find another way to get"+
		 "\n"+" back to the "+place+". Good luck!");
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}
