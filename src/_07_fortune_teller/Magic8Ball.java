package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random ran = new Random();
	// 3. Print out this variable
int i = ran.nextInt(4);
	// 4. Get the user to enter a question for the 8 ball
if(i == 0) {
	// -- tell the user "Yes"
	JOptionPane.showMessageDialog(null, "Yes.");
	// 6. If the random number is 1
}else if(i==1) {

	// -- tell the user "No"
	JOptionPane.showMessageDialog(null, "No.");
	// 7. If the random number is 2
}else if(i==2) {
	// -- tell the user "Maybe you should ask Google?"
	JOptionPane.showMessageDialog(null, "Ask Google.");
	// 8. If the random number is 3
}else if(i==3) {
	// -- write your own answer
	for(int j=0; j<1000; j++) {
		JOptionPane.showMessageDialog(null, "beep");
	}
}
}
}