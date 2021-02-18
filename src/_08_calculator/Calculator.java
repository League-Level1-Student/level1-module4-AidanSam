package _08_calculator;

import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField; 

public class Calculator {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel(); 
	JButton addition = new JButton();
	JButton subtraction = new JButton();
	JButton multiplication = new JButton();
	JButton division = new JButton();
	String number1 = JOptionPane.showInputDialog("enter your first number");
	int num1 = Integer.parseInt(number1);
	String number2 = JOptionPane.showInputDialog("enter your second number");
	int num2 = Integer.parseInt(number2);
	public void run() {
frame.setSize(400, 400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(panel);
frame.setVisible(true);
		add();
		subtract();
		multiply();
		divide();
	}
	
	public void add() {
		int answer = num1 + num2;
		JOptionPane.showMessageDialog(null, answer);	
	}
	public void subtract() {
		int answer = num1 - num2;
		JOptionPane.showMessageDialog(null, answer);	
	}
	public void multiply() {
		int answer = num1 * num2;
		JOptionPane.showMessageDialog(null, answer);	
	}
	public void divide() {
		double answer =(double) num1 / num2;
		JOptionPane.showMessageDialog(null, answer);	
	}
}
	
