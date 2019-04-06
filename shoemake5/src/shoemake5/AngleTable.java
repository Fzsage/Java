// This program will create a table showing the sine, cosine, and tangent for angles
// in increments of 5 from 0-90

package shoemake5;

public class AngleTable {

	public static void main(String[] args) {
		
		// Print headers
		System.out.println("Angle\tSine\t\tCosine\t\tTangent");
		System.out.println("-----\t----\t\t------\t\t-------");
		
		// For each angle, output the sine, cosine, and tangent
		for (int i = 0; i <= 90; i+=5) {
			System.out.print(i + "\t");
			
			// Declare variables within scope to be reused for each iteration
			// Perform calculations
				double sine = Math.sin(i * Math.PI / 180);
				double cos = Math.cos(i * Math.PI / 180);
				double tan = Math.tan(i * Math.PI / 180);
			// Output calculations to table
				System.out.printf("%.5f\t\t", sine);
				System.out.printf("%.5f\t\t", cos);
				System.out.printf("%.5f\t\n", tan); // Be sure to include \n or else next iteration will not output on new line
			
			
		}
		
	}

}
