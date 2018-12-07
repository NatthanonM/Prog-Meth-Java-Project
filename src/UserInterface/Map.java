package UserInterface;

import java.util.ArrayList;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import logic.Stage;

public class Map {
	
	private static ArrayList<Stage> stages = new ArrayList<>();
	
	public Map() {
		stages.add(new Stage(1));
		stages.add(new Stage(2));
		stages.add(new Stage(3));
		stages.add(new Stage(4));
		stages.add(new Stage(5));
		stages.add(new Stage(6));
		stages.add(new Stage(7));
		stages.add(new Stage(8));
		stages.add(new Stage(9));
		stages.add(new Stage(10));
		stages.add(new Stage(11));
		stages.add(new Stage(12));
		stages.add(new Stage(13));
		stages.add(new Stage(14));
		stages.add(new Stage(15));
	}

	public ArrayList<Stage> getStages() {
		return stages;
	}
	
	public Stage getStages(int i) {
		return stages.get(i);
	}

}