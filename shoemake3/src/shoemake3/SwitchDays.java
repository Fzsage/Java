// This program will prompt the user for a day number and output the corresponding day's name using a switch

package shoemake3;

import java.util.Scanner;

public class SwitchDays {

	public static void main(String[] args) {
		
		// Prompt user to enter a number
		System.out.println("Enter the number of a day. You may only enter a number 1-7.");
		Scanner input = new Scanner(System.in);
		int dayNum = input.nextInt();
		
		input.close();
		
		// Switch to output the name of a day depending on which number the user entered
		switch (dayNum){
		case 1:
			System.out.println("You entered the number 1. That day is Monday.");
			break;
		case 2:
			System.out.println("You entered the number 2. That day is Tuesday.");
			break;
		case 3:
			System.out.println("You entered the number 3. That day is Wednesday.");
			break;
		case 4:
			System.out.println("You entered the number 4. That day is Thursday.");
			break;
		case 5:
			System.out.println("You entered the number 5. That day is Friday.");
			break;
		case 6:
			System.out.println("You entered the number 6. That day is Saturday.");
			break;
		case 7:
			System.out.println("You entered the number 7. That day is Sunday.");
			break;
		default:
			System.out.println("That is not an acceptable number. Please enter a number 1 through 7.");
			
		
		}

	}

}
