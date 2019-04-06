package chapter1and2;

import java.util.Scanner;

public class IntPlay {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer ");
		int num1 = input.nextInt();
		System.out.println("Enter another integer ");
		int num2 = input.nextInt();
		input.close();
		
		int quotient = num1 / num2;
		System.out.println("The result is " + quotient);
		
	
	}

}
