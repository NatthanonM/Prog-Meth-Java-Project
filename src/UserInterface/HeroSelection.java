package UserInterface;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import logic.Knight;
import logic.Mage;

public class HeroSelection implements Initializable, ControlledScreen {
	
	ScreensController myController;
	
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
		Map.getInstance().update();
		myController.setScreen(Main.screen3ID);
	}
	
	@FXML
	private void onMageMouseClick() throws IOException {
		Main.hero = new Mage("Mage", 100, 10, 100, "Skill 1", "Skill 2");
		myController.setScreen(Main.screen3ID);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	@Override
	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
	}
	
}
