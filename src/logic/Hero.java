package logic;

public abstract class Hero extends Character implements UsePotion {
	private int mana;

	public Hero(String name, int maxHP, int power, int mana) {
		super(name, maxHP, power);
		this.mana = mana;
	}

	public boolean usePotion() {
		if (this.getHealth() == this.getMaxHp())
			return false;
		if (this.isDead())
			return false;
		if (this.getMaxHp() - this.getHealth() < 50) {
			this.setHealth(this.getMaxHp());
		} else {
			this.setHealth(getHealth() + 50);
		}
		return true;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public abstract boolean useSkill(String skill, Character monster);
}
