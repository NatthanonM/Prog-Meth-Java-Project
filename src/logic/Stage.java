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
			Character snake1 = new Character("Snake",100,9);
			Character snake2 = new Character("Snake",100,9);
			Character bear = new Character("Bear",120,7);
			monsters.add(snake1);
			monsters.add(snake2);
			monsters.add(bear);
		}else if(stage==6) {
			Character bear = new Character("Bear",150,11);
			Character wolf = new Character("Wolf",140,10);
			Character snake = new Character("Snake",100,9);
			monsters.add(bear);
			monsters.add(wolf);
			monsters.add(snake);
		}else if(stage==7) {
			Character bear = new Character("Bear",150,11);
			Character wolf1 = new Character("Wolf",140,10);
			Character wolf2 = new Character("Wolf",140,10);
			monsters.add(bear);
			monsters.add(wolf1);
			monsters.add(wolf2);
		}else if(stage==8) {
			Character werewolf1 = new Character("Werewolf",180,17);
			Character wolf1 = new Character("Wolf",140,10);
			Character wolf2 = new Character("Wolf",140,10);
			monsters.add(werewolf1);
			monsters.add(wolf1);
			monsters.add(wolf2);
		}else if(stage==9) {
			Character ghost1 = new Character("Ghost",150,10);
			Character ghost2 = new Character("Ghost",150,10);
			Character ghost3 = new Character("Ghost",150,10);
			monsters.add(ghost1);
			monsters.add(ghost2);
			monsters.add(ghost3);
		}else if(stage==10) {
			Character zombie = new Character("Zombie",180,15);
			Character ghost1 = new Character("Ghost",150,10);
			Character ghost2 = new Character("Ghost",150,10);
			monsters.add(zombie);
			monsters.add(ghost1);
			monsters.add(ghost2);
		}else if(stage==11) {
			Character zombie1 = new Character("Zombie",180,15);
			Character zombie2 = new Character("Zombie",180,15);
			Character zombie3 = new Character("Zombie",180,15);
			monsters.add(zombie1);
			monsters.add(zombie2);
			monsters.add(zombie3);
		}else if(stage==12) {
			Character skeleton1 = new Character("Skeleton",200,15);
			Character skeleton2 = new Character("Skeleton",200,15);
			Character devil = new Character("Devil",220,18);
			monsters.add(skeleton1);
			monsters.add(skeleton2);
			monsters.add(devil);
		}else if(stage==13) {
			Character devil = new Character("Devil",220,18);
			Character crocodian1 = new Character("Crocodian",250,20);
			Character crocodian2 = new Character("Crocodian",250,20);
			monsters.add(devil);
			monsters.add(crocodian1);
			monsters.add(crocodian2);
		}else if (stage==14) {
			Character golem1 = new Character("Golem",300,15);
			Character golem2 = new Character("Golem",300,15);
			Character golem3 = new Character("Golem",300,15);
			monsters.add(golem1);
			monsters.add(golem2);
			monsters.add(golem3);
		}else if (stage==15) {
			Character golem1 = new Character("Golem",300,15);
			Character golem2 = new Character("Golem",300,15);
			Character dragon = new Character("Dragon",350,25);
			monsters.add(golem1);
			monsters.add(golem2);
			monsters.add(dragon);
		}
		
	}
}
