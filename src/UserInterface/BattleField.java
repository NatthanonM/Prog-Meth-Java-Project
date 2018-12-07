package UserInterface;

import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import logic.GameManager;
import logic.Hero;
import logic.Knight;
import logic.Stage;

public class BattleField extends Pane{
	
	private Hero hero;
	private Pane top;
	private Pane bottom;
	private Stage stage;
	private ImageView heroImage, monster1, monster2, monster3;
	private Pane HPPane, MPPane, attackPane, passPane, inventPane, runPane, AttackMenu, inventMenu;
	private ProgressBar heroHP, heroMP, monster1HP, monster2HP, monster3HP;
	private GameManager gameManager = new GameManager();

	public BattleField(Stage stage) {
		super();
		this.stage = stage;
		top = drawScreen();
		bottom = drawMenu();
		bottom.setLayoutY(400);
		
		this.getChildren().addAll(top, bottom);
		
		
	}

	private Pane drawScreen() {
		Pane screen = new Pane();
		screen.setPrefHeight(400);
		screen.setPrefWidth(800);
		if (gameManager.getHero() instanceof Knight) {
			heroImage = new ImageView(new Image(ClassLoader.getSystemResource("images/knight.png").toString()));
		} else {
			heroImage = new ImageView(new Image(ClassLoader.getSystemResource("images/mage.png").toString()));
			heroImage.setScaleX(0.2);
			heroImage.setScaleY(0.2);
			heroImage.setLayoutX(-250);
			heroImage.setLayoutY(-300);
		}

		Pane pane1 = new Pane();
		drawMonsterPane(pane1, monster1, 0, monster1HP, 400, 100);
		Pane pane2 = new Pane();
		drawMonsterPane(pane2, monster2, 1, monster2HP, 600, 0);
		Pane pane3 = new Pane();
		drawMonsterPane(pane3, monster3, 2, monster3HP, 600, 200);

		screen.getChildren().addAll(heroImage, pane1, pane2, pane3);
		return screen;
	}

	public void drawMonsterPane(Pane pane, ImageView image, int i, ProgressBar pb, int x, int y) {
		pane.setLayoutX(x);
		pane.setLayoutY(y);
		pane.setMaxSize(200, 200);
		image = new ImageView(new Image(
				getClass().getResource("/images/monster/" + stage.getMonsters().get(i).getName() + ".png").toString()));
		image.setX(0);
		image.setY(0);
		image.setScaleX(0.5);
		image.setScaleY(0.5);
		pb = new ProgressBar();
		pb.setProgress(1);
		pb.setStyle("-fx-accent : red");
		pb.setPrefWidth(150);
		pb.setLayoutX(15);
		pb.setLayoutY(25);
		pb.setScaleX(0.75);
		pb.setScaleY(0.75);
		pane.getChildren().addAll(image, pb);
	}

	private Pane drawMenu() {
		Pane menu = new Pane();
		menu.setPrefSize(800, 200);
		GridPane gp = new GridPane();
		gp.setPrefSize(678, 180);
		gp.setLayoutX(72);
		gp.setPadding(new Insets(10));
		gp.setVgap(10);
		gp.setHgap(100);

		HPPane = new Pane();
		drawStatusPane(HPPane, "HP", heroHP);
		MPPane = new Pane();
		drawStatusPane(MPPane, "MP", heroMP);
		
		attackPane = new Pane();
		drawMenuPane(attackPane, "Attack");
		passPane = new Pane();
		drawMenuPane(passPane, "Pass");
		inventPane = new Pane();
		drawMenuPane(inventPane, "Inventory");
		runPane = new Pane();
		drawMenuPane(runPane, "Run!");

		gp.add(HPPane, 0, 0);
		gp.add(MPPane, 0, 1);
		gp.add(attackPane, 1, 0);
		gp.add(passPane, 2, 0);
		gp.add(inventPane, 1, 1);
		gp.add(runPane, 2, 1);

		menu.getChildren().addAll(gp);
		return menu;
	}

	public void drawStatusPane(Pane pane, String text, ProgressBar pb) {
		Label t = new Label();
		t.setText(text);
		t.setStyle("-fx-font-size:28px;");
		pb = new ProgressBar();
		pb.setProgress(1);
		pb.setPrefWidth(150);
		if (text.equals("HP")) {
			t.setLayoutX(180);
			t.setLayoutY(20);
			pb.setLayoutX(15);
			pb.setLayoutY(30);
			pb.setStyle("-fx-accent : red");
		} else {
			t.setLayoutX(180);
			t.setLayoutY(-20);
			pb.setLayoutX(15);
			pb.setLayoutY(-10);
			pb.setStyle("-fx-accent : blue");
		}
		pane.getChildren().addAll(pb, t);
	}

	public void drawMenuPane(Pane pane, String text) {
		Label t = new Label();
		t.setText(text);
		if(text.equals("Attack")) {
			t.setStyle("-fx-font-size: 28px; -fx-border-color: red; -fx-border-width: 2px;");
			t.setLayoutX(17);
			t.setLayoutY(0);
		} else if(text.equals("Pass")) {
			t.setStyle("-fx-font-size: 28px; -fx-border-color: green; -fx-border-width: 2px;");
		} else if(text.equals("Inventory")) {
			t.setStyle("-fx-font-size: 28px; -fx-border-color: blue; -fx-border-width: 2px;");
		} else {
			t.setStyle("-fx-font-size: 28px; -fx-border-color: gray; -fx-border-width: 2px;");
		}
		pane.setCursor(Cursor.HAND);
		pane.getChildren().addAll(t);
	}

	
	public void update() {
		top = drawScreen();
		bottom = drawMenu();
	}
}
