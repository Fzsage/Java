package shoemake10;

public class Motor {
	private int cylinders;
	private int hp;
	private String type;
	
	public Motor(int cylinders, int hp, String type) {
		
		this.cylinders = cylinders;
		this.hp = hp;
		this.type = type;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getHp() {
		return hp;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Motor: cylinders=" + cylinders + ", hp=" + hp + ", type=" + type;
	}
}

