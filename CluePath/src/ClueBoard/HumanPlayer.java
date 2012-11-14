package ClueBoard;

import java.awt.Graphics;

public class HumanPlayer extends Player{
	private boolean finished = false;
	public HumanPlayer(String name, String color, int location) {
		super(name, color, location);
		// TODO Auto-generated constructor stub
	}	
	
	public boolean isFinished() {
		return finished;
	}
	
	public void takeTurn(Board board) {
		board.highlightTargets();
		this.finished = true;
	}
}
