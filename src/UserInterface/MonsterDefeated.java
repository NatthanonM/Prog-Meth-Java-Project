package UserInterface;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MonsterDefeated extends Application {
	Stage stage;

	@Override
	public void start(Stage primaryStage) throws IOException {
		
		stage = primaryStage;
		Group root = (Group) FXMLLoader.load(getClass().getResource("Lobby.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
			
		//////////////////////////////////////////
		primaryStage.setTitle("Monster Defeated");
		primaryStage.setResizable(false);
		primaryStage.setWidth(800);
		primaryStage.setHeight(600);
		//////////////////////////////////////////
			
		primaryStage.show();
			
	}

	public static void main(String[] args) {
		launch(args);
	}
}
