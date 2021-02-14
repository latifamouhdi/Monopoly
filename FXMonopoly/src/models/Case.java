package models;

import java.util.Dictionary;
import java.util.HashMap;


public abstract class Case {

	public Sealable sealable;
	
	public Dictionary<Integer, Integer> position=new Dictionary<Integer, Integer>() {
	};
	
	public abstract String description();
	
	


	
	
}
