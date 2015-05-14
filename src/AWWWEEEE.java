import javax.swing.JOptionPane;


public class AWWWEEEE
{public static void main(String[] args)
{//Custom button text
	Object[] options = {"Yes.",
            "No.",
            "Get a better hobby!"};
int n = JOptionPane.showOptionDialog(null,
"Do you like programming? ",

"A Silly Question",
JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,
null,
options,
options[2]);

System.out.println(n);

if(n==0){
	JOptionPane.showInputDialog(null,"Why?");
}
	else if(n==1){
		JOptionPane.showInputDialog(null,"You are so wrong! Although I now know I can't trust your opinion, I would like to know why you dont like programming.");
	}
		else if(n==2){
			JOptionPane.showInputDialog(null,"Why don't you? Also, why don't you like programming?");
			
		
		}
	} 
	
	
}


