package UserInterface;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import logic.Hero;
import logic.Knight;
import logic.Mage;

public class HeroSelection extends Pane {

	private Pane knight, mage;
	private Hero hero;

	public HeroSelection() {
		BorderPane bp = new BorderPane();
		bp.setPrefSize(800, 600);
		bp.setPadding(new Insets(50));

		Label s = new Label();
		s.setText("Select your Hero");
		s.setStyle("-fx-font-size: 64px;");
		s.setPrefWidth(800);
		s.setAlignment(Pos.CENTER);

		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setPrefSize(800, 800);
		gp.setHgap(80);

		knight = new Pane();
		drawHeroPane(knight, "Knight");

		mage = new Pane();
		drawHeroPane(mage, "Mage");

		gp.add(knight, 0, 0);
		gp.add(mage, 1, 0);

		bp.setTop(s);
		bp.setCenter(gp);

		this.getChildren().add(bp);
		this.setVisible(false);
	}

	private void drawHeroPane(Pane pane, String type) {
		ImageView Pic = new ImageView(ClassLoader.getSystemResource("images/" + type + ".png").toString());
		Label Text = new Label();
		Text.setStyle("-fx-font-size: 48px;");
		Text.setLayoutY(15);
		if (type.equals("Knight")) {
			pane.setPrefSize(200, 300);
			Text.setText("Knight");
			Text.setLayoutX(15);
			Pic.setLayoutX(0);
			Pic.setLayoutY(103);
			Pic.setFitHeight(183);
			Pic.setFitWidth(200);
			pane.setOnMouseClicked(e -> {
				hero = new Knight();
			});
		} else {
			pane.setPrefSize(150, 300);
			Text.setText("Mage");
			Text.setLayoutX(20);
			Pic.setLayoutX(20);
			Pic.setLayoutY(102);
			Pic.setFitHeight(175);
			Pic.setFitWidth(150);
			pane.setOnMouseClicked(e -> {
				hero = new Mage();
			});
		}
		pane.setCursor(Cursor.HAND);
		pane.getChildren().addAll(Text, Pic);
	}

	public void show(boolean show) {
		this.setVisible(show);
	}

	public Hero getHero() {
		return hero;
	}

	public Pane getKnight() {
		return knight;
	}

	public Pane getMage() {
		return mage;
	}

	public void setKnight(Pane knight) {
		this.knight = knight;
	}

	public void setMage(Pane mage) {
		this.mage = mage;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}

}
