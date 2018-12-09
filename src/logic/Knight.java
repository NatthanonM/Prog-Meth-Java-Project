package logic;

public class Knight extends Hero implements Attackable, UsePotion {

	public Knight() {
		super("Knight", 150, 10, 100, 10, 50);
	}

	
	@Override
	public boolean useSkill(Character monster1, Character monster2) {
		if (isDead())
			return false;
		monster1.takeDamage(25);
		monster2.takeDamage(25);
		this.setMana(getMana() - 10);
		return true;
	}
	
	@Override
	public boolean useSkill(Character monster) {
		if (isDead())
			return false;
		monster.takeDamage(100);
		this.setMana(getMana() - 50);
		return true;
	}


	@Override
	public boolean useSkill(Character monster1, Character monster2, Character monster3) {
		return false;
	}
	


}
