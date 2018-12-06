package UserInterface;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import logic.Monster;

public class BattleField implements Initializable, ControlledScreen{
	
	private static BattleField instance;

	public BattleField() {
		instance = this;
	}

	public static BattleField getInstance() {
		return instance;
	}
	
	ScreensController myController;
	
	@FXML
	private static ImageView hero, monster1, monster2, monster3;
	
	@FXML
	private Pane Attack, Pass, Inventory, Run;

	@FXML
	private ProgressBar heroHP, heroMP, monster1HP, monster2HP, monster3HP;

	@FXML
	private void Run() throws IOException {
		myController.setScreen(Main.screen3ID);
	}
	
	@FXML
	private void Attack() throws IOException {
		
	}
	
	@FXML
	public void update() {
		for( Monster m : Map.getStages(Main.gameManager.getCurrentState()).getMonsters() ) {
			if(m.getName().equals("Slime")) {
				monster1.setImage(new Image(ClassLoader.getSystemResource("images/Slime.png").toString()));
			}
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		update();
	}
	
	@Override
	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
	}
	

}
