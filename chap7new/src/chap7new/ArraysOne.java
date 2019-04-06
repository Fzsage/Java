package chap7new;

public class ArraysOne {

	public static void main(String[] args) {

		// declare a reference to an array of ints
		int[] nums;
		// create array of 10 ints with default values (all zero)
		nums = new int[10];
		// loop through array, element by element
		for (int i = 0; i < 10; i++) {
			// Note the loop control variable inside []
			System.out.print(nums[i] + " ");
		}
		// loop through array, assigning each element
		int num = 10;
		for (int i = 0; i < 10; i++) {
			nums[i] = num;
			num += 10;
		}
		System.out.println();
		// loop through array again
		for (int i = 0; i < 10; i++) {
			System.out.print(nums[i] + " ");
		}
		
	}

}
