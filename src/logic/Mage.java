package logic;

public class Mage extends Hero {
	private String skill1;
	private String skill2;

	public Mage(String name,int maxHP,int power,int mana,String skill1,String skill2) {
		super(name,maxHP,power,mana);
		this.skill1 = skill1;
		this.skill2 = skill2;
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
