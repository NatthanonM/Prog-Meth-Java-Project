package UserInterface;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;
import logic.MapUpdater;

public class Map implements Initializable {

	public Map() {
		MapUpdater.initElement();
	}

	@FXML
	private Pane pane;

	@FXML
	private Ellipse e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15;

	@FXML
	private void onE1Click() throws IOException {
		Main.gameManager.setCurrentState(1);
		FXMLLoader battleField = new FXMLLoader(getClass().getResource("/UserInterface/battleField.fxml"));
		Pane pane = (Pane) battleField.load();
		Main.stage.setScene(new Scene(pane));
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		MapUpdater.update();
	}

}