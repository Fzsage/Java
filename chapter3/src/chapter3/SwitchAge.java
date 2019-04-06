package chapter3;

import java.util.Scanner;

public class SwitchAge {

	public static void main(String[] args) {
		
		System.out.println("Enter your age");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		
		input.close();
		
		switch (age){
		case 10:
			System.out.println("You are a pup");
			break;
		case 20:
			System.out.println("You are a youth");
			break;
		case 60:
			System.out.println("You are getting up there");
			break;
		default:
			System.out.println("Don't know what to say about that");
			
		
		}
		

	}

}
