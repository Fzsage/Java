package chapter9;

public class TestPerson {

	public static void main(String[] args) {
		
		Person person1 = new Person ("Sage Shoemake", 'M', 23); // Construct new persons
		Person person2 = new Person ("Honly Conly", 'M', 21);
		Person person3 = new Person ("Ashley Mashley", 'F', 35);

		Person[] persons = new Person[3]; // Assign person objects to array
		persons[0] = person1;
		persons[1] = person2;
		persons[2] = person3;
		
		System.out.println("Three people at first");
		for(Person p : persons){ // Display status of persons
			System.out.println(p.toString());
		}
		System.out.println();
		
		changeName(person2, "John Smith"); // Change the name of person 2
		agePersons(persons, 5); // Increase the age of all persons by 5 years
		
		System.out.println("Three people after 5 years:"); 
		
		for(Person p : persons){ 
			System.out.println(p.toString());
		}
		
		System.out.println("\nThere are " + Person.numFriends + " friends"); // Display the number of objects
		
		
		
	}
	
	public static void changeName(Person p, String newName){ // Change the name of the person object passed to the method
		p.fullName = newName;
	}

	public static void agePersons(Person[] ara, int yrs){ // Change the age of all objects by the number passed to method
		for(Person p : ara){
			p.age = p.getAge() + yrs;
		}
	}
}
