// This program will prompt the user to enter a three word string and 
// Display the number of characters in the phrase, in the middle words, and 
// display the final word in all upper case

package shoemake4;

import java.util.Scanner;

public class ThreeWordString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a phrase with three words with spaces in between each word");
		String phrase = input.nextLine();
		String finalWord = phrase.substring((phrase.lastIndexOf(" ") + 1), phrase.length());
		input.close();
		
		System.out.println("There are " + phrase.length() + " characters in that string");
		System.out.println("There are " + ((phrase.lastIndexOf(" ") - phrase.indexOf(" ") - 1)) + " characters in the middle word");
		System.out.println("The final word in uppercase is " + finalWord.toUpperCase());
	}

}
