package UserInterface;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import logic.GameManager;
import logic.Hero;

public class Main extends Application {
	
	private Stage stage;
	private static Map map;
	private static Lobby lobby;
	private static HeroSelection heroSelection;

	@Override
	public void start(Stage primaryStage){
		
		setStage(primaryStage);
		lobby = new Lobby();
		heroSelection = new HeroSelection();
		setStage(primaryStage);
		
		StackPane root = new StackPane();
		root.getChildren().addAll(lobby, heroSelection);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
		primaryStage.setTitle("Monster Defeated");
		primaryStage.setResizable(false);
		primaryStage.setWidth(800);
		primaryStage.setHeight(600);
		primaryStage.show();

	}

	public static HeroSelection getHeroSelection() {
		return heroSelection;
	}

	public static void main(String[] args) {
		launch(args);
	}

	public static Lobby getLobby() {
		return lobby;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

}