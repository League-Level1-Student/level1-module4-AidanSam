package _04_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Joke {
	JButton button = new JButton();
	JButton button1 = new JButton();
	public void run() {
	makeButtons();
		
		
		
	}
	void makeButtons() {
		JFrame frame = new JFrame();

	JPanel panel = new JPanel();
	frame.add(panel);
	button.setText("Joke");
	button1.setText("punchline");
	panel.add(button);
	panel.add(button1);
	frame.pack();
	frame.setVisible(true);
	}
}
