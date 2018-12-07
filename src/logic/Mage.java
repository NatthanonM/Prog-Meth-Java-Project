package logic;

public class Mage extends Hero implements Attackable, UseItem{
	private String skill1;
	private String skill2;

	public Mage() {
		super("Mage",100,5,150);
		this.skill1 = "Mskill1";
		this.skill2 = "Mskill2";
	}
	
	public void attack() {
		
	}
	
	@Override
	public boolean useSkill(String skill,Character monster) {
		if(isDead(this)) return false;
		if(skill==skill1) {
			monster.takeDamage(20);
			this.setMana(getMana()-15);
			return true;
		}
		if(skill==skill2) {
			monster.takeDamage(45);
			this.setMana(getMana()-25);
			return true;
		}
		return false;
	}

}
