package _08_calculator;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField; 

public class Calculator implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel(); 
	JButton addition = new JButton();
	JButton subtraction = new JButton();
	JButton multiplication = new JButton();
	JButton division = new JButton();
	JTextField Text1 = new JTextField(20);
	JTextField Text2 = new JTextField(20);
	
	String number1 = JOptionPane.showInputDialog("enter your first number");
	int num1 = Integer.parseInt(number1);
	String number2 = JOptionPane.showInputDialog("enter your second number");
	int num2 = Integer.parseInt(number2);
	public void run() {
		
frame.setSize(400, 200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(panel);
addition.addActionListener(this);
subtraction.addActionListener(this);
multiplication.addActionListener(this);
division.addActionListener(this);
frame.setVisible(true);
panel.setLayout(null);
Text1.setBounds(100,20,165,25);
Text2.setBounds(100,50,165,25);
addition.setText("addition");
addition.setBounds(10, 80, 80, 25);
subtraction.setText("subtraction");
subtraction.setBounds(100, 80, 80, 25);
multiplication.setText("multiply");
multiplication.setBounds(190, 80, 80, 25);
division.setText("division");
division.setBounds(280, 80, 80, 25);
panel.add(Text1);
panel.add(Text2);
panel.add(addition);
panel.add(subtraction);
panel.add(multiplication);
panel.add(division);

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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if(pressed==addition) {
			add();
	}
		if(pressed==subtraction) {
			subtract();
	}
		if(pressed==multiplication) {
			multiply();
	}
		if(pressed==division) {
			divide());
	}
}
}
	
