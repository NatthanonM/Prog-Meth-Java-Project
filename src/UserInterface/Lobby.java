package UserInterface;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Lobby implements Initializable {

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
		Pane scene = FXMLLoader.load(getClass().getResource("HeroSelection.fxml"));
		Main.stage.setScene(new Scene(scene));
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
}
