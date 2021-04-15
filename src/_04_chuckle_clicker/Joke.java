package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Joke implements ActionListener{
	JButton button = new JButton();
	JButton button1 = new JButton();
	public void run() {
		int e = 15%4;
		JOptionPane.showConfirmDialog(null, e);
	makeButtons();
		
		
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if(pressed==button) {
			JOptionPane.showMessageDialog(null, "Why do seagulls fly by the sea?");
		}
		if(pressed==button) {
			JOptionPane.showMessageDialog(null, "If they flew by the bay they would be bagels");
		}
	}
	void makeButtons() {
		JFrame frame = new JFrame();

	JPanel panel = new JPanel();
	frame.add(panel);
	button.setText("Joke");
	button.addActionListener(this);
	button1.setText("punchline");
	button1.addActionListener(this);
	panel.add(button);
	panel.add(button1);
	frame.pack();
	frame.setVisible(true);
	}
}
