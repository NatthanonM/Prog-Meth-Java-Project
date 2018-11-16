package UserInterface;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Lobby extends Application {

	@FXML
	private Label gameName;
	
	@FXML
	private Label gameStart;
	
	@Override
	public void start(Stage Lobby) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Lobby.fxml"));
			Lobby.setTitle("Monster Defeated");
			Lobby.setScene(new Scene(root));
			Lobby.setResizable(false);
			Lobby.setWidth(800);
			Lobby.setHeight(600);
			Lobby.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
