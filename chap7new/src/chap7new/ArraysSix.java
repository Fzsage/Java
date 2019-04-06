package chap7new;

import java.util.Arrays;

public class ArraysSix {

	public static void main(String[] args) {
		
		// call returnArray and "catch" returned array as ara2
		int[] ara2 = returnArray(6);
		for(int n : ara2) {
			System.out.print(n + " ");
		}

	}
	
	public static int[] returnArray(int size) {
		int[] ara = new int[size];
		int index = 0;
		// using a while loop for a change
		while(index < size) {
			ara[index++] = (int)(Math.random() * 21); // 0-20
		}
		Arrays.sort(ara);   // sort before returning
		return ara;
	}
}
