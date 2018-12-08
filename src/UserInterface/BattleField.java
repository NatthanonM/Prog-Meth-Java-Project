package UserInterface;

import javafx.scene.control.Button;
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
	private GameStage stage;
	private ImageView knightImage, mageImage;
	private Monster m1, m2, m3;
	private Pane top, mPane1, mPane2, mPane3, statusPane;
	private Button attack, skill, usePotion, ultimate;

	public BattleField(GameStage stage) {
		super();
		this.stage = stage;

		this.knightImage = new ImageView();
		this.mageImage = new ImageView();
		this.m1 = stage.getMonsters().get(0);//
		this.m2 = stage.getMonsters().get(1);//
		this.m3 = stage.getMonsters().get(2);//
		this.mPane1 = new Pane();//
		this.mPane2 = new Pane();//
		this.mPane3 = new Pane();//
		this.statusPane = new Pane();//
		this.attack = new Button();
		this.skill = new Button();
		this.usePotion = new Button();
		this.ultimate = new Button();

		top = drawScreen(mPane1, mPane2, mPane3);
		drawHero();
		drawMenu(attack, skill, usePotion, ultimate);

		this.getChildren().addAll(knightImage, mageImage, top, statusPane, attack, skill, usePotion, ultimate);
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
		// draw text
		Label h = new Label();
		h.setText("HP");
		h.setStyle("-fx-font-size:28px;");
		h.setLayoutX(20);
		h.setLayoutY(450);
		Label m = new Label();
		m.setText("MP");
		m.setStyle("-fx-font-size:28px;");
		m.setLayoutX(20);
		m.setLayoutY(490);
		// draw ProgressBar
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
		//
		ProgressBar pm = new ProgressBar();
		pm.setStyle("-fx-accent : blue");
		if (hero.getMana() <= 0) {
			ph.setProgress(0);
		} else {
			ph.setProgress((hero.getHealth() + 0.0) / hero.getMaxHp());
		}
		pm.setProgress((hero.getMana() + 0.0) / hero.getMana());
		pm.setPrefSize(250, 20);
		pm.setLayoutX(70);
		pm.setLayoutY(500);
		/////
		pane.getChildren().addAll(h, m, ph, pm);
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

	public void update() {
		this.getChildren().remove(top);
		this.getChildren().remove(statusPane);

		top = drawScreen(mPane1, mPane2, mPane3);
		statusPane = drawStatusPane();

		this.getChildren().addAll(top, statusPane);
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

}