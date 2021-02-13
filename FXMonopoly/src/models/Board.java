package models;

public class Board {
	public static Board board;
	
	Case caze;
	
	private Board() {
		
	}
	
	public static Board getInstance() {
		if(board==null) {
			board=new Board();
		}
		
		return board;
		
	}
}
