package logic;

public abstract class Hero extends Character implements UseItem {
	private int mana;
	public Hero(String name,int maxHP,int power,int mana){
		super(name,maxHP,power);
		this.mana=mana;
	}
	public boolean useItem(String item) {
		if(isDead(this)) return false;
		if(item == "Red Potion") {
			this.setHealth(getHealth()+50);
			return true;
		}
		if(item == "Blue Potion") {
			this.setMana(getMana()+50);
			return true;
		}
		if(item == "Green Potion") {
			this.setPower(getPower()+5);
			return true;
		}
		return false;
	}
	
	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
	public abstract void useSkill(Character monster);
}
