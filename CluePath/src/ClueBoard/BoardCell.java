package ClueBoard;

public class BoardCell {
	private int row;
	private int column;
	

	
	public boolean isWalkway() {
		return false;
	}
	
	public boolean isRoom() {
		return false;
	}
	
	public boolean isDoorway() {
		return false;
	}
	
	public BoardCell getBoardCell() {
		return this;
	}
	
	public int getRow(){
		return row;
	}
	
	public int getCol(){
		return column;
	}
	
	public void setRow(int r){
		row = r;
	}
	
	public void setCol(int c){
		column = c;
	}
	
//	public void draw() {
//		System.out.println()
//	}
	
}