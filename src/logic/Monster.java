package logic;

public class Monster extends Character implements Attackable {

	public Monster(String name, int maxHP, int power) {
		super(name, maxHP, power);
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
