package logic;

import java.util.ArrayList;

public class Stage3  {
	public static Stage3 instance = new Stage3();
	private ArrayList<Monster> monsters;
	
	public Stage3() {
		monsters = new ArrayList<Monster>();
		Bat bat = new Bat();
		Snake snake = new Snake();
		Bear bear = new Bear();
		this.monsters.add(bat);
		this.monsters.add(snake);
		this.monsters.add(bear);
		
	}
}