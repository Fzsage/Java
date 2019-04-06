// This program will take user input for 2 numbers. The program will divide the larger
// number by the smaller number and output the quotient and remainder without using
// division or remainder operators

package shoemake5;

import java.util.Scanner;

public class RepeatSubtraction {

	public static void main(String[] args) {
			
			// Get user input for first number
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a 3-digit integer");
			int num1 = input.nextInt();
			
			// Get user input for second number
			System.out.println("Please enter a 2-digit integer");
			int num2 = input.nextInt();
			input.close();
			
			// Initialize counter to find quotient
			int quotient = 0;
			
			// Subtract num2 from num1 as long as num1 is greater than 0 and num2 to prevent getting negative number
			// quotient variable will increment every time loop is run, giving us the quotient
			// use -= to modify num1 which will eventually give us the remainder when loop ends
			while (num1 > 0 && num1 > num2) {
				num1 -= num2;
				quotient++;
			}
			
			System.out.println("Answer is " + quotient + " with remainder " + num1);

	}

}
