package models;

import java.util.ArrayList;

public class Board {
	public static Board board;
	
//	Case caze;
	ArrayList<Case> cases=new ArrayList<Case>();
	
	private Board() {
		
		
	}
	
	public static Board getInstance() {
		if(board==null) {
			board=new Board();
		}
		
		return board;
		
	}
}
