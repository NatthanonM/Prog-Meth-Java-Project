package UserInterface;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import logic.GameManager;
import logic.GameStage;

public class Main extends Application {
	public static Stage primaryStage;
	@Override
	public void start(Stage primaryStage) {
		Lobby lobby = new Lobby();
		HeroSelection heroSelection = new HeroSelection();
		BattleField battleField = new BattleField(new GameStage(1));

		GameManager gm = new GameManager(lobby, heroSelection, battleField);

		gm.setUpLobbyEvent(lobby.getGameStart());
		gm.setUpHeroSelectionEvent(heroSelection.getKnight(), heroSelection.getMage());
		gm.setUpBattleField(battleField.getAttack(), battleField.getSkill(), battleField.getUsePotion(),
				battleField.getUltimate());

		StackPane root = new StackPane();
		root.getChildren().addAll(battleField, heroSelection, lobby);

		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Monster Defeated");
		primaryStage.setResizable(false);
		primaryStage.setWidth(800);
		primaryStage.setHeight(600);
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static void close() {
		primaryStage.close();
	}

}