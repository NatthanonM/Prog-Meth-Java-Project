package UserInterface;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import logic.Stage;

public class Map implements Initializable, ControlledScreen {

	private static Map instance;

	public Map() {
		instance = this;
	}

	public static Map getInstance() {
		return instance;
	}

	ScreensController myController;

	@FXML
	private Pane pane;

	@FXML
	protected static Ellipse e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15;

	@FXML
	private void onE1Click() throws IOException {
		Main.gameManager.setCurrentState(1);
		BattleField.getInstance().update();
		myController.setScreen(Main.screen4ID);
	}
	
	private static ArrayList<Ellipse> mapList = new ArrayList<>();
	private static ArrayList<Stage> stages = new ArrayList<>();
	
	public static void initElement() {
		mapList.add(e1);
		mapList.add(e2);
		mapList.add(e3);
		mapList.add(e4);
		mapList.add(e5);
		mapList.add(e6);
		mapList.add(e7);
		mapList.add(e8);
		mapList.add(e9);
		mapList.add(e10);
		mapList.add(e11);
		mapList.add(e12);
		mapList.add(e13);
		mapList.add(e14);
		mapList.add(e15);
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
	
	public void update() {
		for (int i = 0; i < stages.size(); i++) {
			if (stages.get(i).isClear()) {
				mapList.get(i).setFill(Color.GREEN);
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
	
	public static ArrayList<Ellipse> getMapList() {
		return mapList;
	}

	public static ArrayList<Stage> getStages() {
		return stages;
	}
	
	public static Stage getStages(int i) {
		return stages.get(i);
	}

}