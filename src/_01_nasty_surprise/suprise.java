package _01_nasty_surprise;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class suprise {
	public void run() {
		

JButton leftButton = new JButton();
JButton rightButton = new JButton();
JFrame frame = new JFrame();
JPanel panel = new JPanel();
frame.add(panel);
frame.setVisible(true);
leftButton.setText("Treat!");
rightButton.setText("Trick!");
leftButton.addActionListener(null);
rightButton.addActionListener(null);
panel.add(leftButton);
panel.add(rightButton);
frame.pack();
frame.setTitle("Trick Or Treat");

	}
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		System.out.println("eijiuaewhe");
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	    
	}
	
}

