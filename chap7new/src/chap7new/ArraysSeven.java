package chap7new;

import java.util.Arrays;

public class ArraysSeven {

	public static void main(String[] args) {
		// 2D arrays are "arrays of arrays".
		// Each element of a 2D array is itself an array.

		int start = 10;
		int[][] araTwoD = new int[3][5];
		for(int row = 0; row < araTwoD.length; row++) {
			for(int col = 0; col < araTwoD[row].length; col++) {
				araTwoD[row][col] = start;
				start += 5;
			}
		}
		/*for(int row = 0; row < araTwoD.length; row++) {
			for(int col = 0; col < araTwoD[row].length; col++) {
				System.out.print(araTwoD[row][col] + " ");
			}
			System.out.println();
		}*/
		
		// crudely dump the array
		System.out.println(Arrays.toString(araTwoD[0]));
		System.out.println(Arrays.toString(araTwoD[1]));
		System.out.println(Arrays.toString(araTwoD[2]));	
	}
}
