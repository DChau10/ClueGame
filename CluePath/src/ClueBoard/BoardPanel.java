package ClueBoard;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class BoardPanel extends JPanel{
	
	private int rows, cols;
	private static int cellSize = 25;
	Board b;
	ArrayList<Graphics> cellRects = new ArrayList<Graphics>();

	public BoardPanel(Board board) {
		rows = board.getNumRows();
		cols = board.getNumColumns();
		b = board;
	}
	
	public void paintComponent(Graphics g) {
	  super.paintComponent(g);
	  
	  //Draw background
	  g.setColor(Color.DARK_GRAY);
	  g.fillRect(0, 0, rows * cellSize, cols * cellSize);
	  
	  for(BoardCell c : b.getCellList()) {
		  c.draw(g, cellSize);
	  }
	}

	

}
