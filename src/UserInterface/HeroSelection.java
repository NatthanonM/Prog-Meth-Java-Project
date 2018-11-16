package UserInterface;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HeroSelection extends Application {

	@Override
	public void start(Stage HS) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("HeroSelection.fxml"));
			HS.setScene(new Scene(root));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
