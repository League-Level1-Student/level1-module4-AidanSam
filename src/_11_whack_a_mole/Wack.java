package _11_whack_a_mole;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Wack {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
     JButton button1 = new JButton();
     JButton button2 = new JButton();
     JButton button3 = new JButton();
     JButton button4 = new JButton();
public void run() {

	frame.setVisible(true);
	frame.setSize(1000, 1000);
	frame.add(button1);
	frame.add(button2);
	frame.add(button3);
	frame.add(button4);
	
}
}
