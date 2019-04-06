package chap7new;

import java.util.Arrays;

public class ArraysFive {

	public static void main(String[] args) {
		// Arrays are immutable. They cannot be re-sized.
		// Elements cannot be deleted (can be re-assigned new values)
		String[] strAra = new String[4];  // sets size at 4 elements
		
		strAra[0] = "Trump";
		strAra[1] = "Clinton";
		strAra[2] = "Castle";
		strAra[3] = "Stein";
		
		//strAra = new String[5];  
		//strAra[4] = "Johnson";
		
		// using a FOREACH loop to traverse the array
		for(String s : strAra) {
			System.out.print(s + " ");
		}
		
		// run the arrayPlay method, passing strAra as argument
		arrayPlay(strAra);
		System.out.println();

		// "dump" array to screen (only when developing)
		System.out.println(Arrays.toString(strAra));
	}
	
	public static void arrayPlay(String[] s) {
		// use the Arrays class sort method to sort the names
		Arrays.sort(s);
	}

}
