package UserInterface;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	protected static Stage stage;
	protected static ScreenController screenController;

	@Override
	public void start(Stage primaryStage) throws IOException {
		Main.stage = primaryStage;
		Pane root = FXMLLoader.load(getClass().getResource("Lobby.fxml"));
		primaryStage.setScene(new Scene(root));

		Main.screenController = new ScreenController();
		screenController.addScreen("HeroSelection", FXMLLoader.load(getClass().getResource("HeroSelection.fxml")));
		screenController.addScreen("Map", FXMLLoader.load(getClass().getResource("Map.fxml")));

		//////////////////////////////////////////
		primaryStage.setTitle("Monster Defeated");
		primaryStage.setResizable(false);
		primaryStage.setWidth(800);
		primaryStage.setHeight(600);
		//////////////////////////////////////////

		primaryStage.show();

	}

	public Stage getStage() {
		return stage;
	}

	public static void main(String[] args) {
		launch(args);
	}

}