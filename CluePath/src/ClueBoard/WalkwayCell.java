package ClueBoard;

import java.awt.Color;
import java.awt.Graphics;

public class WalkwayCell extends BoardCell {
	
	public WalkwayCell() {
		
	}
	
	public boolean isWalkway() {
		return true;
	}
	
	public void draw(Graphics g, int size, int x, int y) {
		//draw yellow filled
		g.setColor(Color.YELLOW);
		g.fillRect(x * size, y * size, size, size);
		//draw cell outline
		g.setColor(Color.BLUE);
		g.drawRect(x * size, y * size, size, size);	
	}
}
