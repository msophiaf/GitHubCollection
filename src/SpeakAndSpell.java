import javax.swing.JOptionPane;

/**
 * Teacher's Note: Have the kids play with the Speak & Spell. The first Speak &
 * Spell was introduced at the summer Consumer Electronics Show in June 1978,
 * making it one of the earliest handheld electronic devices with a visual
 * display to use interchangeable game cartridges. Discuss with students how you
 * would make this program. Allow them to code it themselves, or use this
 * recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		 speak("spell mandelbrot");
		
				
		// 2. Catch the user's answer in a String
		 String answer= JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct"
if(answer.equals("mandelbrot")){
	JOptionPane.showMessageDialog(null,"Correct");}
	else{
		JOptionPane.showMessageDialog(null, "Incorrect, the correct spelling is manelbrot");
	}


	
	speak("spell loggorhea");
	String answerT=JOptionPane.showInputDialog("");
	
if(answerT.equals("loggorhea")){
JOptionPane.showMessageDialog(null,"Correct");}
else{
	JOptionPane.showMessageDialog(null, "Incorrect, the correct spelling is loggorhea");
}
speak("spell bumf");
String answerX=JOptionPane.showInputDialog("");

// 2. Catch the user's answer in a String

// 3. If the user spelled the word correctly, speak "correct"
if(answerX.equals("bumf")){
JOptionPane.showMessageDialog(null,"Correct");}
else{
JOptionPane.showMessageDialog(null, "Incorrect, the correct spelling is bumf");

}
speak("spell angiitis");
String answerA=JOptionPane.showInputDialog("");
//2. Catch the user's answer in a String

//3. If the user spelled the word correctly, speak "correct"
if(answerA.equals("angiitis")){
JOptionPane.showMessageDialog(null,"Correct");}
else{
JOptionPane.showMessageDialog(null, "Incorrect, the correct spelling is angiitis");

}
speak("spell antediluvian");
String answerC=JOptionPane.showInputDialog("");
//2. Catch the user's answer in a String

//3. If the user spelled the word correctly, speak "correct"
if(answerC.equals("antideluvian")){
JOptionPane.showMessageDialog(null,"Correct");}
else{
JOptionPane.showMessageDialog(null, "Incorrect, the correct spelling is antidiluvian");

}
speak("spell gobbledegook");
String answerY=JOptionPane.showInputDialog("");
//2. Catch the user's answer in a String

//3. If the user spelled the word correctly, speak "correct"
if(answerY.equals("gobbledegook")){
JOptionPane.showMessageDialog(null,"Correct");}
else{
JOptionPane.showMessageDialog(null, "Incorrect, the correct spelling is gobbledegook");
}
speak("spell gladiolus");
String answerB=JOptionPane.showInputDialog("");
//2. Catch the user's answer in a String

//3. If the user spelled the word correctly, speak "correct"
if(answerB.equals("gladiolus")){
JOptionPane.showMessageDialog(null,"Correct");}
else{
JOptionPane.showMessageDialog(null, "Incorrect, the correct spelling is gladiolus");

}
speak("spell plenipotentiary");
String answerR=JOptionPane.showInputDialog("");
//2. Catch the user's answer in a String

//3. If the user spelled the word correctly, speak "correct"
if(answerR.equals("plenipotentiary")){
JOptionPane.showMessageDialog(null,"Correct");
}
else{
JOptionPane.showMessageDialog(null, "Incorrect, the correct spelling is plenipotentiary");

}
speak("spell pochemuchka");
String answerZ=JOptionPane.showInputDialog("");
//2. Catch the user's answer in a String

//3. If the user spelled the word correctly, speak "correct"
if(answerZ.equals("pochemuchka")){
JOptionPane.showMessageDialog(null,"Correct");}
else{
JOptionPane.showMessageDialog(null, "Incorrect, the correct spelling is pochemuchka");

}
}

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words

	

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
