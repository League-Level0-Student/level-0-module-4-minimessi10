package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickles=JOptionPane.showInputDialog(null,"how many nickles you got bro?");
String quarters=JOptionPane.showInputDialog(null,"how many quarters you got bro?");
String dimes=JOptionPane.showInputDialog(null,"how many dimes you got bro?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int money=Integer.parseInt(nickles);
int cash= Integer.parseInt(quarters);  
int hello=Integer.parseInt(dimes);
		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 
double total=money*.05+cash*0.25+hello*0.10;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null,total);
	}
}

