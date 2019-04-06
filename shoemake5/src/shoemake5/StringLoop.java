// This program will take a name as user input and do the following:
// Display the name backwards
// Output number of vowels in the name
// Output the number of consonants in the name

package shoemake5;

import java.util.Scanner;

public class StringLoop {

	public static void main(String[] args) {
		
		// Prompt user for name
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your full name, please.");
		String name = input.nextLine();
		input.close();
		
		
		// Print name backwards
		for (int i = name.length()-1; i >= 0; i--) {
			
			    System.out.print(name.charAt(i));
		}
		
		System.out.println();
		
		// Initialize counters for vowels and consonants
		int vowel = 0;
		int consonant = 0;
		int space = 0;
		
		// loop to count how many vowels and consonants are in string
		for (int i = 0; i < name.length(); i++) {
			
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u'
					|| name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' || name.charAt(i) == 'O' || name.charAt(i) == 'U'){
				vowel++;
			}
			// Could use consonant - 1 but this handles instances where a user may type multiple spaces
			else if (name.charAt(i) == ' '){
				space++;
			}
			else{
				consonant++;
			}
		
		}
		System.out.println("There are " + vowel + " vowels and " + consonant + " consonants.");
		
		    
	}

}
