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
JButton pointer = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
     
     JButton mole;
     int point = 0;
public void run() {
	int num = ran.nextInt(24);
	panel = new JPanel();
	pointer.setText(point);
	panel.add(pointer);
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
		frame.remove(panel);
		run();
		
	}
	}
			
			
		

}

