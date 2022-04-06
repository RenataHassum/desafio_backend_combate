package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;

	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public void takeDamage(Champion other) {
		if (other.getArmor() >= this.attack) {
			other.setLife(other.getLife() - 1);
		} else {
			other.setLife(other.getLife() + other.getArmor() - this.attack);
		}
	}

	public String status() {
		if (this.life <= 0) {
			return this.name + ": 0 de vida (morreu)";

		} else {
			return this.name + ": " + this.life + " de vida";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

}
