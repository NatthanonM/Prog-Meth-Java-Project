package UserInterface;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import logic.GameManager;
import logic.Hero;

public class Main extends Application {
	protected static Stage stage;
	protected static Map map;
	protected static Hero hero;
	protected static GameManager gameManager;
		
    public static String screen1ID = "Lobby";
    public static String screen1File = "/FXML/Lobby.fxml";
    public static String screen2ID = "HeroSelection";
    public static String screen2File = "/FXML/HeroSelection.fxml";
    public static String screen3ID = "Map";
    public static String screen3File = "/FXML/Map.fxml";
    public static String screen4ID = "BattleField";
    public static String screen4File = "/FXML/BattleField.fxml";

	@Override
	public void start(Stage primaryStage){
		map = new Map();
		Map.initElement();
		gameManager = new GameManager();
		ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(Main.screen1ID, Main.screen1File);
        mainContainer.loadScreen(Main.screen2ID, Main.screen2File);
        mainContainer.loadScreen(Main.screen3ID, Main.screen3File);
        mainContainer.loadScreen(Main.screen4ID, Main.screen4File);
        
        mainContainer.setScreen(Main.screen1ID);
        
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
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

	public Stage getStage() {
		return stage;
	}

	public static void main(String[] args) {
		launch(args);
	}

}