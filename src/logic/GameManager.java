package logic;

import java.util.ArrayList;

import UserInterface.BattleField;

public class GameManager {
	
	public static GameManager instance = new GameManager();

	private static int currentState = 0;
	private static BattleField battleField; 
	private static ArrayList<Stage> stages;
	private ArrayList<Monster> monsters; 
	private Hero hero;
	
	public GameManager() {
		monsters = (new Stage(1)).getMonsters();
		
		
	}
	
	public void startGame() {
		
	}

	public Stage getCurrentState() {
		return stages.get(currentState);
	}
	
	public static GameManager getInstance() {
		return instance;
	}
	
	public Hero getHero() {
		return hero;
	}
	
	public void setHero(Hero hero) {
		this.hero = hero;
	}

	public static BattleField getBattleField() {
		return battleField;
	}

	public static void setBattleField(BattleField battleField) {
		GameManager.battleField = battleField;
	}
	
}
