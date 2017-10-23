//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
 static	int  happinesslevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in
		// variable
		String pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make
		// their pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Cuddle", "Food", "Water", "Take a walk", "Groom" }, null);

		// 5. Use user input to call the appropriate method created in step 4.
System.out.println(task);
if (task==0){
	Cuddle();
}
		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void Cuddle() {
		JOptionPane.showMessageDialog(null, "Oh boy that's awesome!");
		happinesslevel = happinesslevel + 1;
	}

static	void Water() {
		JOptionPane.showMessageDialog(null, "Yeah, water is awesome!");
		happinesslevel = happinesslevel + 2;
	}

	 static void Food() {
		JOptionPane.showMessageDialog(null, "My favorite thing in the world!");
		happinesslevel = happinesslevel + 3;
	}

	static void Takeawalk() {
		JOptionPane.showMessageDialog(null, "Everyone needs exersise!");
		happinesslevel = happinesslevel + 4;
	}

static	void Groom() {
		JOptionPane.showMessageDialog(null, "I want to feel fancy!!!");
		happinesslevel = happinesslevel + 9;
	}
}