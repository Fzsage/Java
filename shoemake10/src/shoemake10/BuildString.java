package shoemake10;

import java.util.Scanner;

public class BuildString {

	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder(); // Create emptry string builder
		
		char[] ara = {'G', 'o', 's', 'l', 'i', 'n', 'g'}; 
		String name = new String(ara); // Push array of characters to new string
		stringBuilder.append(name); // Push the string to the string builder
		stringBuilder.insert(0, "James "); // Insert James in front of Gosling
		
		System.out.println(stringBuilder);
		
		String string = "I twapped a wascally wabbit";
		String newString = string.replaceAll("w", "r"); // Replace all Ws with Rs in the previous string
		System.out.println(newString);
		
		
		System.out.println("Enter a phone number without an area code");
		Scanner input = new Scanner(System.in); // Get user input for phone number
		String phone = input.nextLine();
		
		if(phone.matches("\\d{3}(-| ){1}\\d{4}")){ // Will allow for 7 straight digits, or 3 followed by ONE space OR hyphen and 4 more digits
			System.out.println("Good input");
		}
		else {
			System.out.println("Bad phone number");
		}
		
		input.close();
		
	}

}
