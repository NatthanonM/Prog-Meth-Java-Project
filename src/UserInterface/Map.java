package UserInterface;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;
import logic.Stage;

public class Map {

	private ArrayList<Ellipse> mapList = new ArrayList<>();
	private ArrayList<Stage> stages = new ArrayList<>();

	@FXML
	private Pane pane;

	@FXML
	private Ellipse e1;

	@FXML
	private Ellipse e2;

	@FXML
	private Ellipse e3;

	@FXML
	private Ellipse e4;

	@FXML
	private Ellipse e5;

	@FXML
	private Ellipse e6;

	@FXML
	private Ellipse e7;

	@FXML
	private Ellipse e8;

	@FXML
	private Ellipse e9;

	@FXML
	private Ellipse e10;

	@FXML
	private Ellipse e11;

	@FXML
	private Ellipse e12;

	@FXML
	private Ellipse e13;

	@FXML
	private Ellipse e14;

	@FXML
	private Ellipse e15;

	public Map() {
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
				
			}
		}
	}

}