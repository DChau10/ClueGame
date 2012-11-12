package ClueBoard;

import javax.swing.*;
import java.awt.*;


public class GameControlPanel extends JPanel{
	private JButton nextPlayer;
	private JButton accusation;
	private JTextField displayTurn;

		
	public GameControlPanel() {
		setLayout(new GridLayout(1,2));
		add(createWhoseTurnDisplay());
		add(createButtons());
		
	}
	private JPanel createButtons() {
		//Create a panel for the buttons
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1,0));
		//Add the Next Player button to the panel
		JButton nextPlayer = new JButton("Next player");
		buttonPanel.add(nextPlayer);
		
		//Add Accusation button
		JButton accusation = new JButton("Make an accusation");
		buttonPanel.add(accusation);
		return buttonPanel;
	}
	
	private JPanel createWhoseTurnDisplay() {
		JPanel turnPanel = new JPanel();
		JLabel whose_turn = new JLabel("Whose Turn?");
		turnPanel.add(whose_turn);
		this.displayTurn = new JTextField(20);
		turnPanel.add(this.displayTurn);
		return turnPanel;
		
	}
	
}
