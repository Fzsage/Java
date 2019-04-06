package chap7new;

public class ArraysTwo {

	public static void main(String[] args) {
		
		// create array of doubles with "array initializer"
		double[] dubAra = {1.1, 2.2, 3.3, 4.4};
		
		double total = 0.0;  // an ACCUMULATOR variable
		// display array and compute the total
		
		// use length property for size of array 
		for(int i = 0; i < dubAra.length; i++) {
			System.out.println(dubAra[i]);
			total += dubAra[i];  // accumulate
		}
		// display total
		System.out.println("The total is " + total);
	}
}
