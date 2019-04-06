// This program will create a table that converts kms to miles and miles to km using
// a method

package shoemake6;

public class TestDistance {

	public static void main(String[] args) {
		
		// Print headers
		System.out.printf("%10s %10s %10s %10s", "Miles", "Km\t", "Km", "Miles\n");
		System.out.printf("%10s %10s %10s %10s", "-----", "--\t", "--", "-----\n");
		
		// Loop using Distance method to create table
		for (double i = 1; i <=10; i+=1){
			System.out.printf("%10.3f", i);
			System.out.printf("%10.3f \t|", Distance.milesToKms(i));
			System.out.printf("%10.3f", i);
			System.out.printf("%10.3f \n", Distance.kmsToMiles(i));
			
			
		}
		
	}

}
