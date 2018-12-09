package logic;

public abstract class Character implements Attackable{
	private String name;
	private int health;
	private int power;
	private int maxHp;

	public Character(String name, int maxHP, int power) {
		this.name = name;
		this.maxHp = maxHP;
		this.health = maxHP;
		this.power = power;
	}

	public boolean takeDamage(int damage) {
		if (this.health == 0) return false;
		if (this.health < damage) {
			this.health = 0;
			return true;
		}
		if (damage < 0) damage = 0;
		this.health -= damage;
		return true;
	}

	public boolean isDead() {
		return health <= 0;
	}

	public boolean attack(Character target) {
		if (!target.isDead()) {
			target.setHealth(target.getHealth() - this.getPower() < 0 ? 0 : target.getHealth() - this.getPower());
			return true;
		} else {
			return false;
		}
	}

	public int getHealth() {
		return this.health;
	}

	public String getName() {
		return this.name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
