package shoemake11;

public class Student extends Person {
	long id;
	String degree;
	
	public Student(String fullName, char gender, int age, long id, String degree) {
		super(fullName, gender, age);
		this.id = id;
		this.degree = degree;
		numFriends++;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", degree=" + degree + "]";
	}
}
