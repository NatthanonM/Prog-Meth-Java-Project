package logic;

public class Knight extends Hero{

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


	@Override
	public boolean attack(Character target) {
		if (!target.isDead()) {
			target.setHealth(target.getHealth() - this.getPower() < 0 ? 0 : target.getHealth() - this.getPower());
			return true;
		} else {
			return false;
		}
	}

}
