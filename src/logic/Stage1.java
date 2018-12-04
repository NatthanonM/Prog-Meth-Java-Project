package logic;

import java.util.ArrayList;

public class Stage1  {
	public static Stage1 instance = new Stage1();
	private ArrayList<Monster> monsters;
	
	public Stage1() {
		monsters = new ArrayList<Monster>();
		Slime slime1 = new Slime();
		Slime slime2 = new Slime();
		Slime slime3 = new Slime();
		monsters.add(slime1);
		monsters.add(slime2);
		monsters.add(slime3);
		
	}
}
	
