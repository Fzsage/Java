// This program will generate two random integers between 10 and 25 and output the positive difference between the two

package shoemake3;

public class RandomInts {

	public static void main(String[] args) {
		
		// Generate two random ints between 10 and 25
		int random1 = 10 + (int)(Math.random() * ((25 - 10) + 1));
		int random2 = 10 + (int)(Math.random() * ((25 - 10) + 1));
		
		// This if else statement will always subtract the lower of the two numbers from the higher to ensure it gets a positive difference
		if (random1 > random2){
			System.out.println("The difference between " + random1 + " " + "and " + random2 + " is " + (random1 - random2));
		}
		else {  
			System.out.println("The difference between " + random2 + " " + "and " + random1 + " is " + (random2 - random1));
		}

		
		
		
		
		
	}

}
