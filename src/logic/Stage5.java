package logic;


public class Stage5  {
	public static Stage5 instance = new Stage5();
	public Dragon boss;
	
	public Stage5() {
		boss = new Dragon();
		
	}
}