import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class GameControlGUI extends JFrame {
	
	private SomeTextField whoseTurn;
	private JButton next, accuse;
	private SomePanel die, guess, guessResult;

	public GameControlGUI() {
		setSize(new Dimension(1000, 150));
		setTitle("Clue");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame.setDefaultLookAndFeelDecorated(true);
			
		setLayout(new GridLayout(2, 4));
		
		whoseTurn = new SomeTextField("Whose Turn?", 20);
		add(whoseTurn);
		
		next = new JButton("Next Player");
		accuse = new JButton("Make an Accusation");
		add(next);
		add(accuse);
		
		die = new SomePanel("Die", "Roll", 5);
		add(die);
		
		guess = new SomePanel("Guess", "Guess", 20);
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

	public static void main(String[] args) {
		GameControlGUI gui = new GameControlGUI();
		gui.setVisible(true);
	}
}
