package UserInterface;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Lobby implements Initializable, ControlledScreen {
	
	ScreensController myController;

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
		myController.setScreen(Main.screen2ID);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	@Override
	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
	}
}
