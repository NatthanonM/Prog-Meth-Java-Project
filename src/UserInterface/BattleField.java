package UserInterface;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import logic.MapUpdater;

public class BattleField implements Initializable{
	
	@FXML
	private Pane Attack, Pass, Inventory, Run;

	@FXML
	private ProgressBar heroHP, heroMP, monster1HP, monster2HP, monster3HP;

	@FXML
	private void Run() throws IOException {
		FXMLLoader map = new FXMLLoader(getClass().getResource("/UserInterface/Map.fxml"));
		Pane pane = (Pane) map.load();
		MapUpdater.update();
		Main.stage.setScene(new Scene(pane));
	}
	
	@FXML
	private void Attack() throws IOException {
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	

}
