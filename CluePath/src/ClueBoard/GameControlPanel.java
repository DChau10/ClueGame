package ClueBoard;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;


public class GameControlPanel extends JPanel{
	private JButton nextPlayer;
	private JButton accusation;
	private JTextField displayTurn;
	private JTextField displayRoll;
	private JTextField displayGuessResult;
	private JTextField displayGuess;
	private int playerNum;
	private Board board;
	private HumanPlayer humanPlayer;
	private ArrayList<ComputerPlayer> computers = new ArrayList<ComputerPlayer>();
	private Player currentPlayer;
	private Random rand;
		
	public GameControlPanel(Board board) {
		this.board = board;
		this.humanPlayer = (HumanPlayer) board.getPlayer(0);

		for (int i = 1; i < board.getPlayerList().size(); i ++) {
			computers.add((ComputerPlayer) board.getPlayerList().get(i));
		}
		this.playerNum = (this.computers.size()-1);
		
		setLayout(new GridLayout(2,0));
		add(createButtons());
		add(createStatus());
		
	}
	public void nextPlayer() {
		//If the current player is not human, increment playerNum
		if (this.playerNum < this.computers.size()) {
			this.playerNum++;
		}
		//If it is human and not finished, return message and set playerNum to 0.
		else {
			if(!this.humanPlayer.isFinished()) {
				JOptionPane.showMessageDialog(null, "You need to finish your turn before moving on!");
				return;
			}
			this.playerNum = 0;
		}
		//if last computer's turn, set the current player to computer
		if (this.playerNum == computers.size()) {
			this.currentPlayer = this.humanPlayer;
		}
		//otherwise, set the current player to the next one.
		else {
			this.currentPlayer = this.computers.get(this.playerNum);
		}
		
		//Update display for Whose Turn
		this.displayTurn.setText(this.currentPlayer.getName());
		//Roll die & update display
		int die = this.rand.nextInt(5)+1;
		this.displayRoll.setText(new Integer(die).toString());
		//Determine targets given current location and die
		this.board.calcTargets(this.currentPlayer.getLocation(), die);
		//Take turn
		this.currentPlayer.takeTurn();
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
