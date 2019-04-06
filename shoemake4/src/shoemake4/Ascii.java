// This program will return the character types of an integer between 48 and 122, relating to an ASCII table

package shoemake4;

public class Ascii {

	public static void main(String[] args) {
		
		// Generate random int between 48 and 122, inclusive
		int random1 = 48 + (int)(Math.random() * ((122 - 48) + 1));
		char ascii = (char)random1;
		
		// Print integer and its respective ASCII character
		System.out.printf("The integer is %d \n",random1);
		System.out.printf("The ASCII character for that is \"%c\" \n", ascii);
		
		// If character is a digit
		if (Character.isDigit(ascii)){
			System.out.println("That is a digit");
		}
		// If char is a letter, specify it's letter and its case
		else if (Character.isLetter(ascii)){
			if (Character.isUpperCase(ascii)){
				System.out.println("That is an uppercase letter");
			}
			else {
				System.out.println("That is a lowercase letter");
			}
		}
		// If not a letter or digit, it is a special character
		else {
			System.out.println("That is punctuation or a special character");
		}
		
		
	

	}

}
