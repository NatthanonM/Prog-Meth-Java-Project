package UserInterface;

import java.io.IOException;
import java.util.HashMap;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import logic.GameManager;
import logic.Hero;

public class Main extends Application {
	protected static Stage stage;
	protected static HashMap<String, Pane> Screens = new HashMap<>();
	protected static Map map;
	protected static Hero hero;
	protected static GameManager gameManager;

	@Override
	public void start(Stage primaryStage) throws IOException {
		map = new Map();
		Main.stage = primaryStage;
		Pane root = FXMLLoader.load(getClass().getResource("Lobby.fxml"));
		primaryStage.setScene(new Scene(root));
		
		/*FXMLLoader HeroSelection = new FXMLLoader(getClass().getResource("/UserInterface/HeroSelection.fxml"));
		Screens.put("HeroSelection", (Pane) HeroSelection.load());*/
		
		/*FXMLLoader Map = new FXMLLoader(getClass().getResource("/UserInterface/Map.fxml"));
		MapUpdate display = Map.getController();
		display.update();
		Screens.put("Map", (Pane) Map.load()); */ 
		
		/*FXMLLoader BattleField = new FXMLLoader(getClass().getResource("/UserInterface/BattleField.fxml"));
		BattleField.setController(this);
		Screens.put("HeroSelection", (Pane) BattleField.load());*/
		

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