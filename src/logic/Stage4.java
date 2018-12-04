package logic;

import java.util.ArrayList;

public class Stage4  {
	public static Stage4 instance = new Stage4();
	private ArrayList<Monster> monsters;
	
	public Stage4() {
		monsters = new ArrayList<Monster>();
		Ghost ghost = new Ghost();
		Wolf wolf1 = new Wolf();
		Wolf wolf2 = new Wolf();
		monsters.add(ghost);
		monsters.add(wolf1);
		monsters.add(wolf2);
		
	}
}