package shoemake11;

public class TestCourse {

	public static void main(String[] args) {
		
		
		Course java = new Course ("COP2250","Java Programming 1"); // Create new course
		Person williams = new Faculty ("Lou Williams", 'M', 32, "Master's", "Computer Science", java); // Create 2 faculty
		Person michaels = new Faculty ("Mike Michaels", 'M', 37, "Bachelor's", "English", new Course("ENC 1000", "Composition 1")); // Anonymous course as argument
		
		System.out.println(williams); // Display faculty
		System.out.println(michaels);
		
		((Faculty) williams).setEducation("Bachelor's"); // Change education of Williams faculty member, cast to faculty to run method
		williams.setFullName("Louis Williams"); // CHange name of Williams faculty member
		
		System.out.println(williams);
		
		Person shoemake = new Student("Sage Shoemake", 'M', 23, 2150725, "Associate's"); // Create new instance of student
		((Student) shoemake).setDegree("A.A."); // change degree of student, cast to student to run methods
		
		System.out.println(shoemake);
		System.out.println("There are " + Person.getNumFriends() + " people associated with this course."); // Display number of persons. Don't know why I'm getting 6?
		
		
		
		
		
	}

}
