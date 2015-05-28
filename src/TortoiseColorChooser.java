// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {

		//3. ask the user what color they would like the tortoise to draw
		String kk=JOptionPane.showInputDialog(null, "What color would you look the tortoise to draw in? Red,green,pink,red,purple,yellow or blue?");
		//4. use an if/else statement to set the pen color that the user requested/if(kk.equals("red")) 
	
	if(kk.equals("green")){
		
Tortoise.setPenColor(Colors.Greens.DarkSeaGreen);
	}
	else if(kk.equals("blue")){
		
			Tortoise.setPenColor(Colors.Blues.Aquamarine);
	}

	else if(kk.equals("red") || kk.equals("Pink")){
		
		Tortoise.setPenColor(Colors.Pinks.PaleVioletRed);
	}
		else if(kk.equals("yellow")){
			
			Tortoise.setPenColor(Colors.Yellows.LemonChiffon);
	
//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(10);
		Tortoise.setSpeed(10);
		
	//1. make the tortoise draw a shape (this will take more than one line of code)
	 for (int i = 0; i < 300; i++) {
		Tortoise.move(i);
		Tortoise.turn(90);
		Tortoise.move(i);
		Tortoise.turn(60);
		Tortoise.move(36);
		Tortoise.turn(i);
		
		
	}
	


	}
}