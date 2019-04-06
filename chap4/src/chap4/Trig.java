package chap4;

public class Trig {

	public static void main(String[] args) {
		
		int degreesA = 30;	// degrees
		double radiansA = Math.toRadians(degreesA);
		System.out.printf("The sine of 30 degrees is %.5f \n", Math.sin(radiansA));
		
		// find angle from cosine value
		double cosineB = 0.70711;
		double radiansB = Math.acos(cosineB);
		double degreesB = Math.toDegrees(radiansB);
		System.out.printf("Angle with cosine = %.5f is %.3f degrees \n", cosineB, degreesB);
		

	}

}
