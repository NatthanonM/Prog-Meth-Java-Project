package UserInterface;

import java.util.HashMap;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class ScreenController {
	private HashMap<String, Scene> Screens = new HashMap<>();

	public ScreenController() {
	}

	public void addScreen(String name, Pane pane) {
		Scene scene = new Scene(pane);
		Screens.put(name, scene);
	}

	public void removeScreen(String name) {
		Screens.remove(name);
	}

	public void activate(String name) {
		Main.stage.setScene(Screens.get(name));
	}

}
