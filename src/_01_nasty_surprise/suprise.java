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

public class suprise implements ActionListener{
	JButton trick = new JButton();
	JButton treat = new JButton();
	public void run() {
		


JFrame frame = new JFrame();
JPanel panel = new JPanel();
frame.add(panel);
frame.setVisible(true);
trick.setText("Trick!");
trick.addActionListener(this);
treat.setText("Treat!");
treat.addActionListener(this);
panel.add(trick);
panel.add(treat);
frame.pack();
frame.setTitle("Trick Or Treat");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if(pressed==trick) {
			showPictureFromTheInternet("https://i.redd.it/fyd6qa4cciy01.jpg");
		}
		if(pressed==treat) {
			showPictureFromTheInternet("https://i.redd.it/7139c8ldn5b61.jpg");
			}
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
