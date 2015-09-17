import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		int randomNumber = new Random().nextInt(5);
		// 2. On paper, write all the numbers that get printed when you run this class
		System.out.println(randomNumber);

		// 3. Use the randomNumber to give the user a random compliment.
for (int i = 0; i < 9; i++) {
	

		if(randomNumber == 0){
	JOptionPane.showMessageDialog(null, "I am in awe of your beauty!");
	
}
if(randomNumber == 1){
	JOptionPane.showMessageDialog(null, "Your personality is amazing!");
}
if(randomNumber == 2){
	JOptionPane.showMessageDialog(null, "Your eyes are an extraordinary color!");
}
if(randomNumber == 3){
	JOptionPane.showMessageDialog(null, "You are very humorous. You make people laugh so hard they double over and run into a pole!");
}
	
	if(randomNumber == 4){
		JOptionPane.showMessageDialog(null, "You are wise beyond your years!");
		
	} randomNumber = new Random().nextInt(5);}
	
	// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}