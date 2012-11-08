package ClueBoard;

import java.awt.Color;
import java.awt.Graphics;

public class WalkwayCell extends BoardCell {
	
	public boolean isWalkway() {
		return true;
	}
	
	public void draw(Graphics g,int size) {
		//draw yellow filled
		g.setColor(Color.YELLOW);
		g.fillRect(this.getRow() * size, this.getCol() * size, size, size);
		//draw cell outline
		g.setColor(Color.BLUE);
		g.drawRect(this.getRow()* size , this.getCol() * size, size, size);	
	}
}
