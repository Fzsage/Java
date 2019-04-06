// This program will take given measurements of a triangle and calculate the sides and angles that aren't given

package shoemake4;

public class TriangleCalc {

	public static void main(String[] args) {
		
		// Declare provided values as variables
		double sideA;
		double sideB = 8;
		double sideC = 10;
		double angleA, angleB;
		double angleC = 90;
		
		// Get the length of angle A using pythagorean theorum a^2 + b^2 = c^2
		sideA = Math.sqrt((sideC * sideC) - (sideB * sideB));
		
		// Get degrees of angle A
		angleA = Math.toDegrees(Math.atan(sideA / sideB));
		
		// get degrees of angleB 
		angleB = angleC - angleA;
		
		// output
		System.out.printf("The length of side A is %.3f \n", sideA);
		System.out.printf("The degrees of angle A is %.3f \n", angleA);
		System.out.printf("The degrees of angle B is %.3f \n", angleB);
				
		
	}

}
