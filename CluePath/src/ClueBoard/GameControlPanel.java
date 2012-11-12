package ClueBoard;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;


public class GameControlPanel extends JPanel{
	private JButton nextPlayer;
	private JButton accusation;
	private JTextField displayTurn;
	private JTextField displayRoll;
	private JTextField displayGuessResult;
	private JTextField displayGuess;
		
	public GameControlPanel() {
		setLayout(new GridLayout(2,0));
		add(createButtons());
		add(createStatus());
		
	}
	private JPanel createButtons() {
		//Create a panel for the buttons
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1,0));
		
		//Add the Whose Turn status
		buttonPanel.add(createWhoseTurnDisplay());
		
		//Add the Next Player button to the panel
		JButton nextPlayer = new JButton("Next player");
		buttonPanel.add(nextPlayer);
		
		//Add Accusation button
		JButton accusation = new JButton("Make an accusation");
		buttonPanel.add(accusation);
		return buttonPanel;
	}
	
	private JPanel createStatus() {
		JPanel status = new JPanel();
		status.add(createDieDisplay());
		status.add(createGuessDisplay());
		status.add(createResultDisplay());
		return status;
	}
	
	private JPanel createWhoseTurnDisplay() {
		JPanel turnPanel = new JPanel();
		JLabel whose_turn = new JLabel("Whose Turn?");
		turnPanel.add(whose_turn);
		this.displayTurn = new JTextField(15);
		turnPanel.add(this.displayTurn);
		return turnPanel;
		
	}
	
	private JPanel createDieDisplay() {
		JPanel diePanel = new JPanel();
		diePanel.setLayout(new GridLayout(0, 2));
		TitledBorder title = BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Die");
		title.setTitleJustification(2);
		diePanel.setBorder(title);
		JLabel roll = new JLabel("Roll");
		diePanel.add(roll);
		this.displayRoll = new JTextField(2);
		this.displayRoll.setEditable(false);
		diePanel.add(this.displayRoll);
		return diePanel;
		
	}
	
	private JPanel createGuessDisplay() {
		
		//create guess panel
		JPanel guessPanel = new JPanel();
		guessPanel.setBorder(BorderFactory.createTitledBorder("Guess"));
		guessPanel.setLayout(new GridLayout(2,0));
		JLabel guess = new JLabel("Guess");
		guessPanel.add(guess);
		this.displayGuess = new JTextField(20);
		guessPanel.add(this.displayGuess);
		displayGuess.setEditable(false);
		
		return guessPanel;
	}
	private JPanel createResultDisplay() {
		
		//create guess result panel
		JPanel guessResultPanel = new JPanel();
		guessResultPanel.setBorder(BorderFactory.createTitledBorder("Guess Result"));
		guessResultPanel.setLayout(new GridLayout(1,2));
		JLabel response = new JLabel("Response");
		guessResultPanel.add(response);
		this.displayGuessResult = new JTextField(15);
		guessResultPanel.add(this.displayGuessResult);
		displayGuessResult.setEditable(false);	
		
		return guessResultPanel;	
	}
	

	
	
	
}
