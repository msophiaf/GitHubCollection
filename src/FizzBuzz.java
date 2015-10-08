import javax.swing.JOptionPane;


public class FizzBuzz {
public static void main(String[] args) {
	
	for( int i = 1; i< 21; i++){

	
if(i%3 == 0){
	JOptionPane.showMessageDialog(null, ("fizz"));
}
else if( i%5 == 0){
	JOptionPane.showMessageDialog(null,("buzz"));
}
else if(i%5 == 0 && i%3 == 0){
	JOptionPane.showMessageDialog(null,("FizzBuzz"));
}
else{
	 JOptionPane.showMessageDialog(null,(i));
}
}
	}





}

