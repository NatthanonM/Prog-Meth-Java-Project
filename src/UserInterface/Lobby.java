package UserInterface;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Lobby {

	@FXML
	private Label gameName;

	@FXML
	private Label gameStart;

	@FXML
	private void onMouseEntered() {
		gameStart.setText("Begin!!!");
		gameStart.setMinWidth(gameStart.getWidth());
	}

	@FXML
	private void onMouseExited() {
		gameStart.setText("click to start!!!");
	}

	@FXML
	private void onMouseClick() throws IOException {
		Main.screenController.activate("HeroSelection");
	}
}
