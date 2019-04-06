package shoemake3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WallyWorld {

	public static void main(String[] args) {
		
		// Price of admission
		int price1 = 105;
		int price2 = 85;
		int price3 = 55;
		// To keep the 2 "0"s behind decimals without using printf since this program does not explicitly call for printf
		DecimalFormat df = new DecimalFormat("0.00");
				
		// Create new scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to input their age
		System.out.println("What is your age?");
		int age = input.nextInt();
		
		input.close();
		
		// Output price of admission for age bracket depending on user input
		if (age >= 20) {
			System.out.println("The price of admission for adults ages 20 and up is $" + df.format(price1));
		}
		else if (age >= 12 && age <= 19) {
			System.out.println("The price of admission for ages 12 to 19 is $" + df.format(price2));
		}
		else if (age >= 4 && age <= 11) {
			System.out.println("The price of admission for ages 4 to 11 is $" + df.format(price3));
		}
		else {
			System.out.println("Sorry, children under the age of 4 are not permitted into the park.");
		}

	}

}
