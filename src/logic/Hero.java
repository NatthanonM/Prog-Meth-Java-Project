package logic;

public abstract class Hero extends Character implements UsePotion {
	private int mana;
	private int maxMP;
	private int manaCost1;
	private int manaCost2;

	public Hero(String name, int maxHP, int power, int maxMP, int manaCost1, int manaCost2) {
		super(name, maxHP, power);
		this.mana = maxMP;
		this.maxMP = maxMP;
		this.manaCost1 = manaCost1;
		this.manaCost2 = manaCost2;
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
	
	public int getMaxMP() {
		return maxMP;
	}

	public int getManaCost1() {
		return manaCost1;
	}

	public int getManaCost2() {
		return manaCost2;
	}

	public abstract boolean useSkill(Character monster);
	
	public abstract boolean useSkill(Character monster1, Character monster2);
	
	public abstract boolean useSkill(Character monster1, Character monster2, Character monster3);
}
