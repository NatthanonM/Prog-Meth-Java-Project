package logic;

import java.util.ArrayList;

public class Stage2  {
	public static Stage2 instance = new Stage2();
	private ArrayList<Monster> monsters;
	
	public Stage2() {
		monsters = new ArrayList<Monster>();
		Slime slime1 = new Slime();
		Bat bat1 = new Bat();
		Slime slime2 = new Slime();
		monsters.add(slime1);
		monsters.add(bat1);
		monsters.add(slime2);
		
	}
}
