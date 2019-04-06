package chap4;

public class RandomInts {

	public static void main(String[] args) {
		
		// random double from 0.0 to 0.999999999
		System.out.printf("%.6f \n", Math.random());
		
		// random double from 0.0 to 9.999999999
		System.out.printf("%.6f \n", Math.random() * 10);
		
		// random int from 0 to 9
		System.out.printf("%d \n", (int) (Math.random() * 10)); // never gets to 10
		
		// random int from 15 to 25
		System.out.printf("%d \n", 15 + (int) (Math.random() * 11)); // never gets to 26

	}

}
