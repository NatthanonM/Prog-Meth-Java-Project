package UserInterface;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import logic.Knight;
import logic.Mage;

public class HeroSelection implements Initializable {
	@FXML
	private Label knightText;
	
	@FXML
	private Label mageText;
	
	@FXML
	private ImageView knightPicture;
	
	@FXML
	private ImageView magePicture;

	@FXML
	private void onKnightMouseEntered() {
		knightPicture.setScaleX(1.1);
		knightPicture.setScaleY(1.1);
		knightPicture.setScaleZ(1.1);
		knightPicture.setFitWidth(knightPicture.getFitWidth());
		knightPicture.setFitHeight(knightPicture.getFitHeight());
	}

	@FXML
	private void onKnightMouseExited() {
		knightPicture.setScaleX(1.0);
		knightPicture.setScaleY(1.0);
		knightPicture.setScaleZ(1.0);
	}
	
	@FXML
	private void onMageMouseEntered() {
		magePicture.setScaleX(1.1);
		magePicture.setScaleY(1.1);
		magePicture.setScaleZ(1.1);
		magePicture.setFitWidth(magePicture.getFitWidth());
		magePicture.setFitHeight(magePicture.getFitHeight());
	}

	@FXML
	private void onMageMouseExited() {
		magePicture.setScaleX(1.0);
		magePicture.setScaleY(1.0);
		magePicture.setScaleZ(1.0);
	}

	@FXML
	private void onKnightMouseClick() throws IOException {
		Main.hero = new Knight("Knight", 100, 10, 100, "Skill 1", "Skill 2");
		FXMLLoader map = new FXMLLoader(getClass().getResource("/UserInterface/Map.fxml"));
		Pane pane = (Pane) map.load();
		Main.stage.setScene(new Scene(pane));
	}
	
	@FXML
	private void onMageMouseClick() throws IOException {
		Main.hero = new Mage("Mage", 100, 10, 100, "Skill 1", "Skill 2");
		FXMLLoader map = new FXMLLoader(getClass().getResource("/UserInterface/Map.fxml"));
		Pane pane = (Pane) map.load();
		Main.stage.setScene(new Scene(pane));
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
}
