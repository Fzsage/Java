package shoemake11;

public class Faculty extends Person {
	String education;
	String dept;
	Course course;
	
	public Faculty(String fullName, char gender, int age, String education, String dept, Course course) {
		super(fullName, gender, age);
		this.education = education;
		this.dept = dept;
		this.course = course;
		numFriends++;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "Faculty [education=" + education + ", dept=" + dept + ", course=" + course + "]";
	}
}
