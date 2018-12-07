package logic;

public class Knight extends Hero implements Attackable, UseItem{
	private String skill1;
	private String skill2;

	public Knight() {
		super("Knight",100,10,100);
		this.skill1 = "KSkill1";
		this.skill2 = "KSkill2";
	}
	
	@Override
	public boolean useSkill(String skill,Character monster) {
		if(isDead(this)) return false;
		if(skill==skill1) {
			monster.takeDamage(20);
			this.setMana(getMana()-10);
			return true;
		}
		if(skill==skill2) {
			monster.takeDamage(35);
			this.setMana(getMana()-15);
			return true;
		}
		return false;
	}
	
}
