package UserInterface;

import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;

public class Lobby extends StackPane {

	private Label gameName, gameStart;
	private ImageView background;

	public Lobby() {
		super();
		Pane bg = new Pane();
		background = new ImageView(new Image(ClassLoader.getSystemResource("images/forest.png").toString()));
		bg.getChildren().add(background);

		VBox vbox = new VBox();
		vbox.setAlignment(Pos.CENTER);
		vbox.setSpacing(100);

		gameName = new Label();
		gameName.setText("Monster Defeated");
		gameName.setStyle("-fx-font-size: 84px");
		gameName.setTextFill(Paint.valueOf("#00f6ff"));
		gameName.setAlignment(Pos.CENTER);

		gameStart = new Label();
		gameStart.setText("click here to start!!!");
		gameStart.setStyle("-fx-font-size: 40px;");
		gameStart.setTextFill(Paint.valueOf("#3fff00"));
		gameStart.setAlignment(Pos.CENTER);
		gameStart.setCursor(Cursor.HAND);

		vbox.getChildren().add(gameName);
		vbox.getChildren().add(gameStart);

		this.getChildren().addAll(bg, vbox);

	}

	public Label getGameStart() {
		return gameStart;
	}

	public void show(boolean show) {
		this.setVisible(show);
	}

}
