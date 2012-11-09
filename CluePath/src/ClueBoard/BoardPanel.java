package ClueBoard;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class BoardPanel extends JPanel{
	
	private int rows, cols;
	private static int cellSize = 25;
	Board b;

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
	  
	  for(int i = 0; i < b.getCellList().size(); ++i) {
		  int[] coordinates = b.getRowCol(i);
		  b.getCellAt(i).draw(g, cellSize, coordinates[0], coordinates[1]);
		  
	  }
	}

	

}
