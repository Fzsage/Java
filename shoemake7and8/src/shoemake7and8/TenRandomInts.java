// Create an array of 10 random integers. Pass the array to a method that will double each index and return the array
// Print the new array with a single space in between each number, and add each index to a running total
// Print the total with correct comma placement

package shoemake7and8;

import java.util.Arrays;

public class TenRandomInts {

	public static void main(String[] args) {
		
		// Create new array of 10 random integers 100-200
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 101) + 100;
		}
		Arrays.sort(nums); // sort the array from lowest to highest
		System.out.println(Arrays.toString(nums)); // print array
		
		int sum = 0; // accumulator for total of second array
		doubleArray (nums); // pass array to method
		
		// iterate over second array using for each loop and print each index with a single space after
		for (int i : nums) {
			System.out.printf("%d ", i);
			sum += i; // add each index to the total 'sum'
		}
		System.out.printf("\nThe total is %,3d", sum); // print total
	}
	
	// multiply each index of array passed to method by 2
	public static int[] doubleArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] *= 2;
		}
		return array;
	}
}
