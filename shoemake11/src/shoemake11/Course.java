package shoemake11;

public class Course {
	String courseCode;
	String courseName;
	
	public Course(String courseCode, String courseName) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
	}
	
	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", courseName=" + courseName + "]";
	}
}
