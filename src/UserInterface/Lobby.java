package UserInterface;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Lobby extends Application {

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
		Stage primaryStage = (Stage) gameStart.getScene().getWindow();
		AnchorPane root = FXMLLoader.load(getClass().getResource("HeroSelection.fxml"));
		primaryStage.getScene().setRoot(root);
	}

	@Override
	public void start(Stage Lobby) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Lobby.fxml"));
			Lobby.setScene(new Scene(root));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
