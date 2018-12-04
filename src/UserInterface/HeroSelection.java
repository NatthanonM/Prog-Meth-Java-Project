package UserInterface;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class HeroSelection {
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
		//set Character code here
		Main.screenController.activate("Map");
	}
	
	@FXML
	private void onMageMouseClick() throws IOException {
		//set Character code here
		Main.screenController.activate("Map");
	}
	
}
