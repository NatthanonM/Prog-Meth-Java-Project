package logic;

import java.util.ArrayList;

public class Stage {
	private ArrayList<Monster> monsters;
	private int stage;
	private boolean clear;

	public Stage(int stage) {
		monsters = new ArrayList<Monster>();
		this.stage = stage;
		if(stage==1) {
			Monster slime1 = new Monster("Slime",100,4);
			Monster slime2 = new Monster("Slime",90,6);
			Monster slime3 = new Monster("Slime",110,5);
			monsters.add(slime1);
			monsters.add(slime2);
			monsters.add(slime3);
		}else if(stage==2) {
			Monster slime1 = new Monster("Slime",100,4);
			Monster bat = new Monster("Bat",120,7);
			Monster slime2 = new Monster("Slime",90,5);
			monsters.add(slime1);
			monsters.add(bat);
			monsters.add(slime2);
		}else if(stage==3) {
			Monster slime = new Monster("Slime",100,4);
			Monster bat = new Monster("Bat",120,7);
			Monster snake = new Monster("Snake",100,9);
			monsters.add(slime);
			monsters.add(bat);
			monsters.add(snake);
		}else if(stage==4) {
			Monster bat1 = new Monster("Bat",120,7);
			Monster snake = new Monster("Snake",100,9);
			Monster bat2 = new Monster("Bat",120,7);
			monsters.add(bat1);
			monsters.add(snake);
			monsters.add(bat2);
		}else if(stage==5) {
			Monster snake1 = new Monster("Snake",100,9);
			Monster bear = new Monster("Bear",120,7);
			Monster snake2 = new Monster("Snake",100,9);
			monsters.add(snake1);
			monsters.add(bear);
			monsters.add(snake2);
		}else if(stage==6) {
			Monster bear = new Monster("Bear",150,11);
			Monster wolf = new Monster("Wolf",140,10);
			Monster snake = new Monster("Snake",100,9);
			monsters.add(bear);
			monsters.add(wolf);
			monsters.add(snake);
		}else if(stage==7) {
			Monster wolf1 = new Monster("Wolf",140,10);
			Monster bear = new Monster("Bear",150,11);
			Monster wolf2 = new Monster("Wolf",140,10);
			monsters.add(wolf1);
			monsters.add(bear);
			monsters.add(wolf2);
		}else if(stage==8) {
			Monster wolf1 = new Monster("Wolf",140,10);
			Monster werewolf1 = new Monster("Werewolf",180,17);
			Monster wolf2 = new Monster("Wolf",140,10);
			monsters.add(wolf1);
			monsters.add(werewolf1);
			monsters.add(wolf2);
		}else if(stage==9) {
			Monster ghost1 = new Monster("Ghost",150,10);
			Monster ghost2 = new Monster("Ghost",150,10);
			Monster ghost3 = new Monster("Ghost",150,10);
			monsters.add(ghost1);
			monsters.add(ghost2);
			monsters.add(ghost3);
		}else if(stage==10) {
			Monster ghost1 = new Monster("Ghost",150,10);
			Monster zombie = new Monster("Zombie",180,15);
			Monster ghost2 = new Monster("Ghost",150,10);
			monsters.add(ghost1);
			monsters.add(zombie);
			monsters.add(ghost2);
		}else if(stage==11) {
			Monster zombie1 = new Monster("Zombie",180,15);
			Monster zombie2 = new Monster("Zombie",180,15);
			Monster zombie3 = new Monster("Zombie",180,15);
			monsters.add(zombie1);
			monsters.add(zombie2);
			monsters.add(zombie3);
		}else if(stage==12) {
			Monster skeleton1 = new Monster("Skeleton",200,15);
			Monster devil = new Monster("Devil",220,18);
			Monster skeleton2 = new Monster("Skeleton",200,15);
			monsters.add(skeleton1);
			monsters.add(devil);
			monsters.add(skeleton2);
		}else if(stage==13) {
			Monster lizardMan1 = new Monster("LizardMan",250,20);
			Monster devil = new Monster("Devil",220,18);
			Monster lizardMan2 = new Monster("LizardMan",250,20);
			monsters.add(lizardMan1);
			monsters.add(devil);
			monsters.add(lizardMan2);
		}else if (stage==14) {
			Monster golem1 = new Monster("Golem",300,15);
			Monster golem2 = new Monster("Golem",300,15);
			Monster golem3 = new Monster("Golem",300,15);
			monsters.add(golem1);
			monsters.add(golem2);
			monsters.add(golem3);
		}else if (stage==15) {
			Monster golem1 = new Monster("Golem",300,15);
			Monster dragon = new Monster("Dragon",350,25);
			Monster golem2 = new Monster("Golem",300,15);
			monsters.add(golem1);
			monsters.add(dragon);
			monsters.add(golem2);
		}
		
	}

	public ArrayList<Monster> getMonsters() {
		return monsters;
	}

	public int getStage() {
		return stage;
	}

	public boolean isClear() {
		return clear;
	}

	public void setClear(boolean clear) {
		this.clear = clear;
	}
}
