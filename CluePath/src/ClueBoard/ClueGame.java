package ClueBoard;

import javax.swing.*;

import java.awt.*;
import java.io.IOException;

public class ClueGame extends JFrame {
	
	private GameFrame game;
	//The playerCounter will increment with every press of the nextPlayer button.
	private int playerCounter = 0;
	
	public ClueGame(Board board) {

		GameFrame game = new GameFrame(board);
		game.setVisible(true);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//The oneTurn function handles the moving of players and the making of suggestions/accusations
//	public void oneTurn(Board b) {
//		//Player counter chooses next player each turn, 0 indicates human player
//		if(playerCounter == 0) {
//			//While (next player is not pressed) >>insert button variable
//			while(true) {
//				b.getPlayer(0).takeTurn();
//			}
//		}else {
//			b.getPlayer(playerCounter).takeTurn();
//			if(b.getCellAt(b.getPlayer(playerCounter).location).isDoorway()) {
//				 b.getPlayer(playerCounter).createSuggestion();
//			}
//		}
//		
//	}
	
	
	
	public static void main(String[] args) throws IOException, BadConfigFormatException {
		Board board = new Board();
		board.loadConfigFiles("config.txt", "legend.txt", "players.txt", "cards.txt");
		
		ClueGame game = new ClueGame(board);
		JOptionPane.showMessageDialog(game,"You are Professor Plum. Press Next Player to begin play", "Welcome to Clue", 1);
	}
		
}
