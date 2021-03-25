package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class PigLatin implements ActionListener{
	String e = JOptionPane.showInputDialog(null);
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField text1 = new JTextField(20);
	JLabel text2 = new JLabel();
	public void run() {
		JOptionPane.showMessageDialog(null, e);
		frame.setSize(300, 300);
		frame.add(panel);
		frame.setVisible(true);
		panel.setSize(300, 300);
		panel.setVisible(true);
		button.setBounds(10, 80, 80, 25);
		frame.setTitle("Translator");
		text1.setBounds(100,20,165,25);
		
		panel.add(button);
		panel.add(text1);
		panel.add(text2);
		frame.pack();
		button.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stube
		JButton pressed = (JButton) e.getSource();
		if(pressed==button) {
String latin = translate(text1.getText());
JOptionPane.showMessageDialog(null, latin);
text2.setText(latin);
		}
	}
	private static String pigWord(String word) {
		int split = firstVowel(word);
		return word.substring(split)+"-"+word.substring(0, split)+"ay";
		
		}
	public String translate(String s) {
	String latin = "";
	int i = 0;
	while (i < s.length()) {
	// Take care of punctuation and spaces
	while (i < s.length() && !isLetter(s.charAt(i))) {
	latin = latin + s.charAt(i);
	i++;
	}
	// If there aren't any words left, stop.
	if (i>=s.length()) break;
	// Otherwise we're at the beginning of a word.
	int begin = i;
	while (i < s.length() && isLetter(s.charAt(i))) {
	i++;
	}
	// Now we're at the end of a word, so translate it.
	int end = i;
	latin = latin + pigWord(s.substring(begin, end));
	}
	return latin;
	}
	private static boolean isLetter(char c) {
		return ( (c >= 'A' && c <= 'Z') || (c >='a' && c <= 'z') );
		}
	/**
	 * 
	* Method to find the index of the first vowel in a word.
	* @param word The word to search
	* @return The index of the first vowel
	*/
		  private static int firstVowel(String word) {
	word = word.toLowerCase();
	for (int i=0; i < word.length(); i++)
	if (word.charAt(i)=='a' || word.charAt(i)=='e' ||
	word.charAt(i)=='i' || word.charAt(i)=='o' ||
	word.charAt(i)=='u')
	return i;
	return 0;
	}
}

