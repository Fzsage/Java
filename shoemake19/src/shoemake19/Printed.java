package shoemake19;

public abstract class Printed {
	private String title;

	public Printed(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Printed title = " + title;
	}
	
	public abstract String distribution();
}
