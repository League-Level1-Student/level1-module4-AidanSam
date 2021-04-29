package _12_slot_machine;

import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Slot {
	int count = 0;
	Frame frame = new JFrame();
	JPanel panel = new JPanel();
	Random ran = new Random();
	Random rand = new Random();
	Random rando = new Random();
	public void run() {
		frame.setVisible(true);
		panel = new JPanel();
		frame.add(panel);
	int num = ran.nextInt(4);
	int numb = rand.nextInt(4);
	int numbe = rando.nextInt(4);
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	panel.add(label1);
	panel.add(label2);
	panel.add(label3);
	
if(num==1) {
label1.setIcon(createLabelImage("Untitled.png"));
}else if(num==2) {
label1.setIcon(createLabelImage("Untitled2.png"));
}else if(num==3) {
label1.setIcon(createLabelImage("Untitled3.png"));
}
if(numb==1) {
label2.setIcon(createLabelImage("Untitled.png"));
}else if(numb==2) {
label2.setIcon(createLabelImage("Untitled2.png"));
}else if(numb==3) {
label2.setIcon(createLabelImage("Untitled3.png"));
}
if(numbe==1) {
label3.setIcon(createLabelImage("Untitled.png"));
}else if(numbe==2) {
label3.setIcon(createLabelImage("Untitled2.png"));
}else if(numbe==3) {
label3.setIcon(createLabelImage("Untitled3.png"));
}
frame.pack();
if(num==numb) {
	if(numb==numbe) {
		JOptionPane.showMessageDialog(null, "You win");
	}
}
}
	private Icon createLabelImage(String fileName){
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return null;
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return icon;

	}
	
}
