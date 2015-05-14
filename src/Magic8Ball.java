// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball
{

	public static void main(String[] args)
	{

		int random = new Random().nextInt(4);
		// 3. Print out this variable
		System.out.println(random);

		String answer = JOptionPane.showInputDialog(null, "Hey user! Why don't you enter a yes or no question in the box below. ");

		if (random == 0)
		{
			JOptionPane.showMessageDialog(null, "Yes, you wish shall come true!");
		}

		else if (random == 1)
		{
			JOptionPane.showMessageDialog(null, "Ha! You actually believed I was psyhic! Talk about gullable!");

		} else if (random == 2)
		{
			JOptionPane.showMessageDialog(null, "It is unknown- even to my fake psychic abilities!");
		} else if (random == 3)
		{
			JOptionPane.showMessageDialog(null, "Figure it out yourself! I'm doing this for free!");
		} 

		if (answer.contains("pretty"))
		{
			JOptionPane.showMessageDialog(null, " And also, you are too shallow to deserve an answer!");
		}
	if(answer.contains("money")){
		JOptionPane.showMessageDialog(null,"You are too shallow to deserve an answer!");
	}
	if(answer.contains("rich")){
		JOptionPane.showMessageDialog(null,"You are too shallow to deserve an answer!");
	}
	
	}}
