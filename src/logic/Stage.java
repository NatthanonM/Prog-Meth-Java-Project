package logic;

import java.util.ArrayList;

public class Stage {
	public static Stage instance = new Stage();
	private ArrayList<Character> monsters;
	private int stage;
	public Stage() {
		monsters = new ArrayList<Character>();
		if(stage==1) {
			Character slime1 = new Character("Slime",100,4);
			Character slime2 = new Character("Slime",90,6);
			Character slime3 = new Character("Slime",110,5);
			monsters.add(slime1);
			monsters.add(slime2);
			monsters.add(slime3);
		}else if(stage==2) {
			Character slime1 = new Character("Slime",100,4);
			Character slime2 = new Character("Slime",90,5);
			Character bat = new Character("Bat",120,7);
			monsters.add(slime1);
			monsters.add(slime2);
			monsters.add(bat);
		}else if(stage==3) {
			Character slime = new Character("Slime",100,4);
			Character bat = new Character("Bat",120,7);
			Character snake = new Character("Snake",100,9);
			monsters.add(slime);
			monsters.add(bat);
			monsters.add(snake);
		}else if(stage==4) {
			Character bat1 = new Character("Bat",120,7);
			Character bat2 = new Character("Bat",120,7);
			Character snake = new Character("Snake",100,9);
			monsters.add(bat1);
			monsters.add(bat2);
			monsters.add(snake);
		}else if(stage==5) {
			Character bear = new Character("Bear",150,11);
			Character wolf = new Character("Wolf",140,10);
			Character snake = new Character("Snake",100,9);
			monsters.add(bear);
			monsters.add(wolf);
			monsters.add(snake);
		}else if(stage==6) {
			Character bear = new Character("Bear",150,11);
			Character wolf1 = new Character("Wolf",140,10);
			Character wolf2 = new Character("Wolf",140,10);
			monsters.add(bear);
			monsters.add(wolf1);
			monsters.add(wolf2);
		}else if(stage==7) {
			Character ghost1 = new Character("Ghost",170,7);
			Character ghost2 = new Character("Ghost",150,10);
			Character dragon = new Character("Dragon",200,14);
			monsters.add(dragon);
			monsters.add(ghost2);
			monsters.add(ghost1);
		}
		
	}
}
