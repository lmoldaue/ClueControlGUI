import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class ControlPanel extends JPanel{
	
	private SomeTextField whoseTurn;
	private SomeButtons next, accuse;
	private SomePanel die, guess, guessResult;
	
	public ControlPanel() {
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    JFrame frame = new JFrame("GridLayout Test");

	    frame.setLayout(new GridLayout(2,4));
	    frame.add(die);
	    frame.add(whoseTurn);
	    frame.add(next);
	    frame.add(accuse);
	    frame.add(guess);
	    frame.add(guessResult);
	    frame.pack();
	    frame.setVisible(true);
		
		setLayout(new GridLayout(2, 4));
		
		whoseTurn = new SomeTextField("Whose Turn?", 20);
		add(whoseTurn);
		
		die = new SomePanel("Die", "Roll", 5);
		add(die);
		
		next = new SomeButtons("Next Player");
		accuse = new SomeButtons("Make an Accusation");
		add(next);
		add(accuse);
		
		guess = new SomePanel("Guess", "Guess", 25);
		add(guess);
		
		guessResult = new SomePanel("Guess Result", "Response", 10);
		add(guessResult);
		
	}
	
	private class SomeTextField extends JPanel {
		private JTextField who;
		
		public SomeTextField(String labelName, int textLength) {
			JLabel label = new JLabel(labelName);
			who = new JTextField(textLength);
			who.setFont(new Font("SansSerif", Font.BOLD, 12));
			add(label);
			add(who);
		}
	}
	
	private class SomeButtons extends JPanel {
		private JButton imAButton;
		
		public SomeButtons(String buttonText) {
			imAButton = new JButton(buttonText);
			add(imAButton);
		}
	}
	
	private class SomePanel extends JPanel {
		private JTextField panelField;
		
		public SomePanel(String panelName, String labelName, int fieldLength) {
		JLabel label = new JLabel(labelName);
		panelField = new JTextField(fieldLength);
		panelField.setFont(new Font("SansSerif", Font.BOLD, 12));
		panelField.setEditable(false);
		setBorder(new TitledBorder (new EtchedBorder(), panelName));
		add(label);
		add(panelField);
		}
	}

}
