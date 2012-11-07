package ClueBoard;

import javax.swing.*;

import java.awt.*;
import java.io.IOException;

public class ClueGame extends JFrame {
	
	
	public ClueGame(Board board) {
		DetectivePanel panel = new DetectivePanel(board);
		panel.setVisible(true);
		panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) throws IOException, BadConfigFormatException {
		Board board = new Board();
		board.loadConfigFiles("config.txt", "legend.txt", "players.txt", "cards.txt");
		
		ClueGame game = new ClueGame(board);
		board.deal();
	}
		
		
}