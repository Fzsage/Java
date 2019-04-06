package chap7new;

public class ArraysThree {

	public static void main(String[] args) {
		// declare an array of 12 ints
		int[] nums = new int[12];
		// assign random integers to array
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 51) + 50;
		}
		// display integers and find highest and lowest
		// nums[0] is both highest and lowest at outset
		int high = nums[0], low = nums[0], hidex = 0, lodex = 0;
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
			if(nums[i] < low) {
				low = nums[i];
				lodex = i;
			}
			if(nums[i] > high) {
				high = nums[i];
				hidex = i;
			}
		}
		// display highest and its index
		System.out.printf("\nHighest: %d, at index %d \n", high, hidex);
		// display lowest and its index
		System.out.printf("Lowest: %d, at index %d \n", low, lodex);
	}
}
