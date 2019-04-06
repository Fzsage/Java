package shoemake12;

import java.util.Scanner;

public class ReadDoubles {

	public static void main(String[] args) throws Exception{
		
	    java.io.File file = new java.io.File("doubles.txt");

	    Scanner input = new Scanner(file); // Open scanner to read file

	    double sum = 0; // Initializer for sum of doubles
	    while (input.hasNext()) {
	      double num = input.nextDouble(); // Read each line of file
	      System.out.println(num); // Output each double
	      sum += num; // Add each double to sum
	    }

	    input.close(); // Close the file
	    
	    System.out.println();
	    System.out.printf("The total is %.2f", sum); // Print the sum of all the doubles
	}

}
