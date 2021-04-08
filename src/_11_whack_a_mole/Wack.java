package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Wack implements ActionListener {
	Random ran = new Random();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
     JButton button1 = new JButton();
     JButton button2 = new JButton();
     JButton button3 = new JButton();
     JButton button4 = new JButton();
     JButton button5 = new JButton();
     JButton button6 = new JButton();
     
     JButton mole;
     int point = 0;
public void run() {
	int num = ran.nextInt(24);
	for(int i = 0; i<24; i++) {
		JButton button = new JButton();
		button.addActionListener(this);
		panel.add(button);
		if(i==num) {
			button.setText("mole");
			mole=button;
		}
	}

frame.add(panel);
	frame.setVisible(true);
	frame.setSize(300, 300);

	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton pressed = (JButton) e.getSource();
	if(pressed == mole) {
		point +=1;
		run();
		
	}
	}
			
			
		

}

