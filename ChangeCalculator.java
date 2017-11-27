//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
 String nickel= JOptionPane.showInputDialog(null,"How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int nick= Integer.parseInt(nickel);
		// Ask the user how many dimes they have, and convert their answer
String dimes= JOptionPane.showInputDialog(null,"How many dimes do you have?");
int dime=Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
String quarters= JOptionPane.showInputDialog(null,"How many quarters do you have?");
int quart= Integer.parseInt(quarters);
		// Calculate how much money the user has and save it in a double variable 
double nickelValue= nick*0.05;
double dimesValue= dime*0.10;
double quartersValue= quart*0.25;
double totalMoney= nickelValue + dimesValue + quartersValue;
JOptionPane.showMessageDialog(null, "Your total rounds up to be $" + totalMoney);
		// Tell the user how much money they have

	}
}

