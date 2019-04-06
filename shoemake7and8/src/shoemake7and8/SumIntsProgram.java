// This program will take any number of arguments, print out the arguments, and print the sum

package shoemake7and8;

import java.util.Arrays;

public class SumIntsProgram {

	public static void main(String[] args) {
		
		System.out.print("Passing ");
		System.out.println(Arrays.toString(args)); // Print arguments
		
		int[] numbers = new int[args.length]; // Convert string array to int
		for(int i = 0;i < args.length;i++)
		{
			numbers[i] = Integer.parseInt(args[i]);
		}
		
		System.out.println("\nThe sum is: " + sumInts(numbers)); // Print sum of arguments
		

	}

	public static int sumInts(int[] numbers) {
        int sum = 0; // accumulator

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // add each argument to sum
        }
        return sum;

    }


}
