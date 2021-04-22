package _12_slot_machine;

import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slot {
	int count = 0;
	Frame frame = new JFrame();
	Random ran = new Random();
	Random rand = new Random();
	JPanel panel = new JPanel();
	public void run() {
		panel = new JPanel();
		for(int i = 0; i<3; i++) {
	int num = ran.nextInt(24);
if(num==1) {
	
}else if(num==2) {
	
}else if(num==3) {
	
}
}
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;

	}
	
}
