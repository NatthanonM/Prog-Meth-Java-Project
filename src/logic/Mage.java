package logic;

public class Mage extends Hero implements Attackable, UsePotion {
	private String skill1;
	private String skill2;

	public Mage() {
		super("Mage", 100, 5, 150);
		this.skill1 = "MSkill1";
		this.skill2 = "MSkill2";
	}

	@Override
	public boolean useSkill(String skill, Character monster) {
		if (isDead())
			return false;
		if (skill == skill1) {
			monster.takeDamage(30);
			this.setMana(getMana() - 15);
			return true;
		}
		if (skill == skill2) {
			monster.takeDamage(40);
			this.setMana(getMana() - 45);
			return true;
		}
		return false;
	}

}
