package ClueBoard;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;

public class GameFrame extends JFrame{

	public GameFrame(Board board) {
		
		setSize(new Dimension(700, 700));
		setTitle("Clue");
		setLayout(new BorderLayout());
		
		BoardPanel bPanel = new BoardPanel(board);
		add(bPanel, BorderLayout.CENTER);
		
	}

}
