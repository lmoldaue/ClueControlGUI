import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;


public class GameControlGUI extends JFrame {

	public GameControlGUI() {
		setSize(new Dimension(1000, 150));
		setTitle("Clue");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ControlPanel cp = new ControlPanel();
		add(cp, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		GameControlGUI gui = new GameControlGUI();
		gui.setVisible(true);
	}
}
