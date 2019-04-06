package shoemake10;

import java.util.Scanner;

public class SecurityCode {

	public static void main(String[] args) {
		
		System.out.println("Please enter a security code");
		
		Scanner input = new Scanner(System.in);
		String a = input.next();
		input.close();
		
		if(a.matches("[a-z][A-Z][a-z][A-Z]\\d{3,4}+[a-z]{1,2}+[A-Z]{2}+\\d")){
			System.out.println("Good input");
		}
		else{
			System.out.println("Bad input. Please try another code.");
		}
		

	}

}
