import javax.swing.JOptionPane;

public class Rolly {
public static void main(String[] args) {
	String Height = JOptionPane.showInputDialog("How tall are you?");
	int num = Integer.parseInt(Height);
	if(num > 4){
		JOptionPane.showMessageDialog(null,"You can ride!");	
		}
		if(num < 4 ){
			JOptionPane.showMessageDialog(null, ("Grow some more first!"));

	}
	}
}

