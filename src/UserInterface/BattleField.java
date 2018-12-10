package UserInterface;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

import javafx.application.Platform;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import logic.GameStage;
import logic.Hero;
import logic.Knight;
import logic.Mage;
import logic.Monster;

public class BattleField extends Pane {

	private Hero hero;
	private int potion = 0;
	private int currentStage = 2;
	private PlaySound sound;
	private GameStage stage;
	private ImageView knightImage, mageImage, background;
	private Monster m1, m2, m3;
	private Pane top, mPane1, mPane2, mPane3, statusPane;
	private Button attack, skill, usePotion, ultimate;
	private Label potionStatus;
	private ArrayList<Monster> aliveMonster;

	public BattleField(GameStage stage) {
		super();
		this.stage = stage;
		this.sound = new PlaySound();
		this.aliveMonster = new ArrayList<Monster>(stage.getMonsters());
		this.knightImage = new ImageView();
		this.mageImage = new ImageView();
		this.background = new ImageView(new Image(ClassLoader.getSystemResource("images/battlefield.png").toString()));
		this.m1 = stage.getMonsters().get(0);
		this.m2 = stage.getMonsters().get(1);
		this.m3 = stage.getMonsters().get(2);
		this.mPane1 = new Pane();
		this.mPane2 = new Pane();
		this.mPane3 = new Pane();
		this.statusPane = new Pane();
		this.attack = new Button();
		this.skill = new Button();
		this.usePotion = new Button();
		this.ultimate = new Button();
		this.potionStatus = new Label();
		top = drawScreen(mPane1, mPane2, mPane3);
		drawHero();
		drawMenu(attack, skill, usePotion, ultimate);
		drawPotionStatus(potionStatus);

		this.getChildren().addAll(background, knightImage, mageImage, top, statusPane, attack, skill, usePotion,
				ultimate, potionStatus);
	}

	/////
	private Pane drawScreen(Pane mPane1, Pane mPane2, Pane mPane3) {
		Pane screen = new Pane();
		screen.setPrefHeight(400);
		screen.setPrefWidth(800);
		mPane1 = new Pane();
		drawMonsterPane(mPane1, m1, 0, 400, 100);
		mPane2 = new Pane();
		drawMonsterPane(mPane2, m2, 1, 600, 0);
		mPane3 = new Pane();
		drawMonsterPane(mPane3, m3, 2, 600, 200);

		screen.getChildren().addAll(mPane1, mPane2, mPane3);
		return screen;
	}

	/////
	private void drawHero() {
		knightImage = new ImageView(new Image(ClassLoader.getSystemResource("images/knight.png").toString()));
		knightImage.setScaleX(0.2);
		knightImage.setScaleY(0.2);
		knightImage.setLayoutX(-400);
		knightImage.setLayoutY(-300);
		mageImage = new ImageView(new Image(ClassLoader.getSystemResource("images/mage.png").toString()));
		mageImage.setScaleX(0.2);
		mageImage.setScaleY(0.2);
		mageImage.setLayoutX(-250);
		mageImage.setLayoutY(-300);
	}

	//////
	public void drawMonsterPane(Pane pane, Monster m, int i, int x, int y) {
		pane.setLayoutX(x);
		pane.setLayoutY(y);
		pane.setMaxSize(200, 200);
		ImageView image = new ImageView(new Image(
				getClass().getResource("/images/monster/" + stage.getMonsters().get(i).getName() + ".png").toString()));
		image.setX(0);
		image.setY(0);
		image.setScaleX(0.5);
		image.setScaleY(0.5);
		Label hp = new Label();
		hp.setText(Integer.toString(m.getHealth()) + "/" + Integer.toString(m.getMaxHp()));
		ProgressBar pb = new ProgressBar();
		if (m.getHealth() <= 0) {
			pb.setProgress(0);
		} else {
			pb.setProgress((m.getHealth() + 0.0) / m.getMaxHp());
		}
		pb.setStyle("-fx-accent : red");
		pb.setPrefWidth(150);
		pb.setLayoutX(15);
		pb.setLayoutY(25);
		pb.setScaleX(0.75);
		pb.setScaleY(0.75);
		pane.getChildren().addAll(image, pb, hp);
	}

	//////
	public Pane drawStatusPane() {
		Pane pane = new Pane();
		/////
		/// draw text
		// hp
		Label hp = new Label();
		hp.setText(Integer.toString(this.hero.getHealth()) + "/" + Integer.toString(this.hero.getMaxHp()));
		hp.setLayoutX(330);
		hp.setLayoutY(455);
		hp.setStyle("-fx-font-size:20px;");
		Label h = new Label();
		h.setText("HP");
		h.setStyle("-fx-font-size:28px;");
		h.setLayoutX(20);
		h.setLayoutY(450);
		// mp
		Label mp = new Label();
		mp.setText(Integer.toString(this.hero.getMana()) + "/" + Integer.toString(this.hero.getMaxMP()));
		mp.setLayoutX(330);
		mp.setLayoutY(495);
		mp.setStyle("-fx-font-size:20px;");
		Label m = new Label();
		m.setText("MP");
		m.setStyle("-fx-font-size:28px;");
		m.setLayoutX(20);
		m.setLayoutY(490);
		/// draw ProgressBar
		// hp
		ProgressBar ph = new ProgressBar();
		ph.setStyle("-fx-accent : red");
		if (hero.getHealth() <= 0) {
			ph.setProgress(0);
		} else {
			ph.setProgress((hero.getHealth() + 0.0) / hero.getMaxHp());
		}
		ph.setPrefSize(250, 20);
		ph.setLayoutX(70);
		ph.setLayoutY(460);
		// mp
		ProgressBar pm = new ProgressBar();
		pm.setStyle("-fx-accent : blue");
		if (hero.getMana() <= 0) {
			pm.setProgress(0);
		} else {
			pm.setProgress((hero.getMana() + 0.0) / hero.getMaxMP());
		}
		pm.setPrefSize(250, 20);
		pm.setLayoutX(70);
		pm.setLayoutY(500);
		pane.getChildren().addAll(hp, h, mp, m, ph, pm);
		return pane;
	}

	/////
	public void drawMenu(Button attack, Button skill, Button usePotion, Button ultimate) {
		attack.setText("Attack");
		attack.setLayoutX(450);
		attack.setLayoutY(450);
		attack.setPrefSize(100, 20);
		skill.setText("Use Skill");
		skill.setLayoutX(600);
		skill.setLayoutY(450);
		skill.setPrefSize(100, 20);
		usePotion.setText("Use Potion");
		usePotion.setLayoutX(450);
		usePotion.setLayoutY(500);
		usePotion.setPrefSize(100, 20);
		ultimate.setText("Ultimate!!");
		ultimate.setPrefSize(100, 20);
		ultimate.setLayoutX(600);
		ultimate.setLayoutY(500);
	}

	public void drawPotionStatus(Label potionStatus) {
		potionStatus.setText("Remaining Potion : " + Integer.toString(this.potion));
		potionStatus.setLayoutX(425);
		potionStatus.setLayoutY(535);
		potionStatus.setStyle("-fx-font-size:16px;");
	}

	public void update() {
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.getChildren().remove(top);
		this.getChildren().remove(statusPane);
		this.getChildren().remove(potionStatus);
		this.updateMonster();
		if (hero.isDead()) {
			Main.getSound().stopNormalSound();
			Alert gameOver = new Alert(AlertType.CONFIRMATION);
			gameOver.setTitle("Game Over!");
			gameOver.setHeaderText("Game Over!");
			gameOver.setContentText("You're Dead.");

			ButtonType res = new ButtonType("Close Game");
			gameOver.getButtonTypes().setAll(res);

			Optional<ButtonType> result = gameOver.showAndWait();
			if (result.get() == res) {
				Platform.exit();
				System.exit(1);
			}
		}
		if (m1.isDead() && m2.isDead() && m3.isDead()) {
			Random rand = new Random();
			int i = rand.nextInt(Integer.MAX_VALUE) % 3;
			this.potion += i;
			if (currentStage > 15) {
				sound.stopBossSound();
				Alert gameOver = new Alert(AlertType.CONFIRMATION);
				gameOver.setTitle("Victory!");
				gameOver.setHeaderText("Victory!");
				gameOver.setContentText("Congratulation !!! You  Win.");

				ButtonType res = new ButtonType("Close Game");
				gameOver.getButtonTypes().setAll(res);

				Optional<ButtonType> result = gameOver.showAndWait();
				if (result.get() == res) {
					Platform.exit();
					System.exit(1);
				}
			}
			stage = new GameStage(currentStage++);
			if (currentStage == 16) {
				Main.getSound().stopNormalSound();
				sound.playBossSound();
			}
			this.aliveMonster = new ArrayList<Monster>(stage.getMonsters());
			this.m1 = stage.getMonsters().get(0);
			this.m2 = stage.getMonsters().get(1);
			this.m3 = stage.getMonsters().get(2);
			this.mPane1 = new Pane();
			this.mPane2 = new Pane();
			this.mPane3 = new Pane();
			top = drawScreen(mPane1, mPane2, mPane3);
			drawHero();
			hero.setMaxMP(hero.getMaxMP() + 5);
			hero.setMaxHp(hero.getMaxHp() + 20);
			hero.setMana(hero.getMaxMP());
			hero.setHealth(hero.getMaxHp());
		}
		hero.setMana(hero.getMana() + 5);
		this.attack.setDisable(hero.isDead());
		this.usePotion.setDisable(this.potion == 0);
		this.skill.setDisable(hero.getMana() < hero.getManaCost1() || hero.isDead());
		this.ultimate.setDisable(hero.getMana() < hero.getManaCost2() || hero.isDead());
		top = drawScreen(mPane1, mPane2, mPane3);
		statusPane = drawStatusPane();
		drawPotionStatus(potionStatus);
		this.getChildren().addAll(top, statusPane, potionStatus);
	}

	public void updateMonster() {
		for (int i = 0; i < aliveMonster.size(); i++) {
			if (aliveMonster.get(i).isDead())
				aliveMonster.remove(i);
		}
	}

	public void updateHero(Hero hero) {
		if (hero instanceof Knight) {
			mageImage.setVisible(false);
			setHero(new Knight());
		} else {
			knightImage.setVisible(false);
			setHero(new Mage());
		}
	}

	public void show(boolean show) {
		this.setVisible(show);
	}

	public Hero getHero() {
		return hero;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}

	public Monster getM1() {
		return m1;
	}

	public void setM1(Monster m1) {
		this.m1 = m1;
	}

	public Monster getM2() {
		return m2;
	}

	public void setM2(Monster m2) {
		this.m2 = m2;
	}

	public Monster getM3() {
		return m3;
	}

	public void setM3(Monster m3) {
		this.m3 = m3;
	}

	public Button getAttack() {
		return attack;
	}

	public Button getSkill() {
		return skill;
	}

	public Button getUsePotion() {
		return usePotion;
	}

	public Button getUltimate() {
		return ultimate;
	}

	public int getPotion() {
		return potion;
	}

	public void setPotion(int potion) {
		this.potion = potion;
	}

	public ArrayList<Monster> getAliveMonster() {
		return aliveMonster;
	}

}