package shoemake18;

import java.util.Scanner;

public class RecursiveSubtraction {

	public static void main(String[] args) {
		 System.out.println("Enter two doubles, in descending order"); // prompt user to enter 2 doubles
		 Scanner input = new Scanner(System.in); // new scanner object
		 double num1 = input.nextDouble(); // get double input from user
		 double num2 = input.nextDouble();
		 input.close();
		 
		 System.out.println((int)num2 + " divides " + subtractRecursively(num1, num2) + " times into " + (int)num1); // call recursive method
		 
	}
	public static int subtractRecursively (double num1, double num2){
		if (num2 == 0){ // dividing by 0 = 0
			return 0;
		}
		else if(num1 - num2 == 0){ // if numbers are the same, quotient is 1
			return 1;
		}
		else if (num1 < num2){ // can't divide smaller number by larger number
			return 0;
		}
		else{
			return (1 + subtractRecursively(num1 - num2, num2)); // first parameter is essentially -=, 1+ is incrementing (quotient)
		}
	}
}
