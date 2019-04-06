package shoemake9;

public class Person {
	String fullName;
	char gender;
	int age;
	public static int numFriends = 0;
	
	public Person(String fullName, char gender, int age) {
		super();
		this.fullName = fullName;
		this.gender = gender;
		this.age = age;
		numFriends++;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getNumFriends() {
		return numFriends;
	}

	@Override
	public String toString() {
		return "Person [fullName=" + fullName + ", gender=" + gender + ", age=" + age + "]";
	}
}
