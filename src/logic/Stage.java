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
			Monster slime2 = new Monster("Slime",90,5);
			Monster bat = new Monster("Bat",120,7);
			monsters.add(slime1);
			monsters.add(slime2);
			monsters.add(bat);
		}else if(stage==3) {
			Monster slime = new Monster("Slime",100,4);
			Monster bat = new Monster("Bat",120,7);
			Monster snake = new Monster("Snake",100,9);
			monsters.add(slime);
			monsters.add(bat);
			monsters.add(snake);
		}else if(stage==4) {
			Monster bat1 = new Monster("Bat",120,7);
			Monster bat2 = new Monster("Bat",120,7);
			Monster snake = new Monster("Snake",100,9);
			monsters.add(bat1);
			monsters.add(bat2);
			monsters.add(snake);
		}else if(stage==5) {
			Monster snake1 = new Monster("Snake",100,9);
			Monster snake2 = new Monster("Snake",100,9);
			Monster bear = new Monster("Bear",120,7);
			monsters.add(snake1);
			monsters.add(snake2);
			monsters.add(bear);
		}else if(stage==6) {
			Monster bear = new Monster("Bear",150,11);
			Monster wolf = new Monster("Wolf",140,10);
			Monster snake = new Monster("Snake",100,9);
			monsters.add(bear);
			monsters.add(wolf);
			monsters.add(snake);
		}else if(stage==7) {
			Monster bear = new Monster("Bear",150,11);
			Monster wolf1 = new Monster("Wolf",140,10);
			Monster wolf2 = new Monster("Wolf",140,10);
			monsters.add(bear);
			monsters.add(wolf1);
			monsters.add(wolf2);
		}else if(stage==8) {
			Monster werewolf1 = new Monster("Werewolf",180,17);
			Monster wolf1 = new Monster("Wolf",140,10);
			Monster wolf2 = new Monster("Wolf",140,10);
			monsters.add(werewolf1);
			monsters.add(wolf1);
			monsters.add(wolf2);
		}else if(stage==9) {
			Monster ghost1 = new Monster("Ghost",150,10);
			Monster ghost2 = new Monster("Ghost",150,10);
			Monster ghost3 = new Monster("Ghost",150,10);
			monsters.add(ghost1);
			monsters.add(ghost2);
			monsters.add(ghost3);
		}else if(stage==10) {
			Monster zombie = new Monster("Zombie",180,15);
			Monster ghost1 = new Monster("Ghost",150,10);
			Monster ghost2 = new Monster("Ghost",150,10);
			monsters.add(zombie);
			monsters.add(ghost1);
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
			Monster skeleton2 = new Monster("Skeleton",200,15);
			Monster devil = new Monster("Devil",220,18);
			monsters.add(skeleton1);
			monsters.add(skeleton2);
			monsters.add(devil);
		}else if(stage==13) {
			Monster devil = new Monster("Devil",220,18);
			Monster lizardMan1 = new Monster("LizardMan",250,20);
			Monster lizardMan2 = new Monster("LizardMan",250,20);
			monsters.add(devil);
			monsters.add(lizardMan1);
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
			Monster golem2 = new Monster("Golem",300,15);
			Monster dragon = new Monster("Dragon",350,25);
			monsters.add(golem1);
			monsters.add(golem2);
			monsters.add(dragon);
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
