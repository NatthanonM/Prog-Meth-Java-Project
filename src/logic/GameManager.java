package logic;

import java.util.Random;

import UserInterface.BattleField;
import UserInterface.HeroSelection;
import UserInterface.Lobby;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class GameManager {

	private Lobby lobby;
	private HeroSelection heroSelection;
	private BattleField battleField;

	public GameManager(Lobby lobby, HeroSelection heroSelection, BattleField battleFiled) {
		this.lobby = lobby;
		this.heroSelection = heroSelection;
		this.battleField = battleFiled;
		this.heroSelection.setVisible(false);
		this.battleField.setVisible(false);

	}

	public void setUpLobbyEvent(Label gameStart) {
		gameStart.setOnMouseClicked(e -> {
			lobby.show(false);
			heroSelection.show(true);
		});
	}

	public void setUpHeroSelectionEvent(Pane pane1, Pane pane2) {
		pane1.setOnMouseClicked(e -> {
			heroSelection.show(false);
			Knight k = new Knight();
			battleField.updateHero(k);
			battleField.update();
			battleField.show(true);
		});

		pane2.setOnMouseClicked(e -> {
			heroSelection.show(false);
			Mage m = new Mage();
			battleField.updateHero(m);
			battleField.update();
			battleField.show(true);
		});
	}

	public void setUpBattleField(Button attack, Button skill, Button usePotion, Button ultimate) {

		usePotion.setOnMouseClicked(e -> {
			battleField.getHero().usePotion();
			battleField.update();
		});

		attack.setOnMouseClicked(e -> {
			if (battleField.getHero() instanceof Knight) {
				Random rand = new Random();
				if (rand.nextInt() == 0) {
					battleField.getHero().attack(battleField.getM1());
					battleField.getM1().attack(battleField.getHero());
				} else if (rand.nextInt() == 1) {
					battleField.getHero().attack(battleField.getM2());
					battleField.getM2().attack(battleField.getHero());
				} else {
					battleField.getHero().attack(battleField.getM3());
					battleField.getM3().attack(battleField.getHero());
				}
			} else {
				battleField.getHero().attack(battleField.getM1());
				battleField.getHero().attack(battleField.getM2());
				battleField.getHero().attack(battleField.getM3());
				int damageDealth = (battleField.getM1().getPower() + battleField.getM2().getPower()
						+ battleField.getM3().getPower()) / 2;
				battleField.getHero().setHealth(battleField.getHero().getHealth() - damageDealth);
			}
			battleField.update();
		});

		skill.setOnMouseClicked(e -> {
			if (battleField.getHero() instanceof Knight) {
				Random rand = new Random();
				if (rand.nextInt() == 0) {
					battleField.getHero().useSkill("KSkill1", battleField.getM2());
					battleField.getHero().useSkill("KSkill1", battleField.getM3());
					int damageSum = (battleField.getM2().getPower() + battleField.getM3().getPower());
					battleField.getHero().setHealth(battleField.getHero().getHealth() - damageSum);
				} else if (rand.nextInt() == 1) {
					battleField.getHero().useSkill("KSkill1", battleField.getM1());
					battleField.getHero().useSkill("KSkill1", battleField.getM3());
					int damageSum = (battleField.getM1().getPower() + battleField.getM3().getPower()) / 2;
					battleField.getHero().setHealth(battleField.getHero().getHealth() - damageSum);
				} else {
					battleField.getHero().useSkill("KSkill1", battleField.getM1());
					battleField.getHero().useSkill("KSkill1", battleField.getM2());
					int damageSum = (battleField.getM1().getPower() + battleField.getM2().getPower()) / 2;
					battleField.getHero().setHealth(battleField.getHero().getHealth() - damageSum);
				}
			} else {
				Random rand = new Random();
				if (rand.nextInt() == 0) {
					battleField.getHero().useSkill("MSkill1", battleField.getM2());
					battleField.getHero().useSkill("MSkill1", battleField.getM3());
					int damageSum = (battleField.getM2().getPower() + battleField.getM3().getPower()) / 2;
					battleField.getHero().setHealth(battleField.getHero().getHealth() - damageSum);
				} else if (rand.nextInt() == 1) {
					battleField.getHero().useSkill("MSkill1", battleField.getM1());
					battleField.getHero().useSkill("MSkill1", battleField.getM3());
					int damageSum = (battleField.getM1().getPower() + battleField.getM3().getPower()) / 2;
					battleField.getHero().setHealth(battleField.getHero().getHealth() - damageSum);
				} else {
					battleField.getHero().useSkill("MSkill1", battleField.getM1());
					battleField.getHero().useSkill("MSkill1", battleField.getM2());
					int damageSum = (battleField.getM1().getPower() + battleField.getM2().getPower()) / 2;
					battleField.getHero().setHealth(battleField.getHero().getHealth() - damageSum);
				}
			}
			battleField.update();
		});

		ultimate.setOnMouseClicked(e -> {
			if (battleField.getHero() instanceof Knight) {
				Random rand = new Random();
				if (rand.nextInt() == 0) {
					battleField.getHero().useSkill("KSkill2", battleField.getM1());
					battleField.getM1().attack(battleField.getHero());
				} else if (rand.nextInt() == 1) {
					battleField.getHero().useSkill("KSkill2", battleField.getM2());
					battleField.getM2().attack(battleField.getHero());
				} else {
					battleField.getHero().useSkill("KSkill2", battleField.getM3());
					battleField.getM3().attack(battleField.getHero());
				}
			} else {
				battleField.getHero().useSkill("MSkill2", battleField.getM1());
				battleField.getHero().useSkill("MSkill2", battleField.getM2());
				battleField.getHero().useSkill("MSkill2", battleField.getM3());
				int damageSum = (battleField.getM1().getPower() + battleField.getM2().getPower()
						+ battleField.getM3().getPower()) / 3;
				battleField.getHero().setHealth(battleField.getHero().getHealth() - damageSum);
			}
			battleField.update();
		});

	}

}
