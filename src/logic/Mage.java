package logic;

public class Mage extends Hero{

	public Mage() {
		super("Mage", 100, 5, 150, 15, 45);
	}
	
	@Override
	public boolean useSkill(Character monster1, Character monster2) {
		if (isDead())
			return false;
		monster1.takeDamage(30);
		monster2.takeDamage(30);
		this.setMana(getMana() - 15);
		return true;
	}
	
	@Override
	public boolean useSkill(Character monster1, Character monster2,  Character monster3) {
		if (isDead())
			return false;
		monster1.takeDamage(40);
		monster2.takeDamage(40);
		monster3.takeDamage(40);
		this.setMana(getMana() - 45);
		return true;
	}

	@Override
	public boolean useSkill(Character monster) {
		return false;
	}
	


}
