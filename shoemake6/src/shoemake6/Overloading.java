// This program will demonstrate method overloading, using two methods with
// the same name but require either different number of parameters
// or a different type accepted.
// For instance, this program uses two instances of the 'difference' method.
// One instance will only accept integer values; the other accepts doubles

package shoemake6;

public class Overloading {
	
	public static void main(String[] args) {
		
		// Declare variables. Change variable values to change outcome of expression
		int a = 12;
		int b = 17;
		double c = 12.5;
		double d = 11.0;
		
		// Output difference between two numbers. Changing parameters will change which 'difference' method is called.
		// a/b for integers, c/d for decimal numbers.
		System.out.println("The difference between the two numbers is " + difference(c, d));
	}

	// Calculates difference of two ints. if/else to ensure it's always a positive number
	public static int difference(int a, int b) {
		if (a > b) {
			int c = a - b;
			return c;
		}
		else {
			int c = b - a;
			return c;
		}	
	}
	
	// Calculate difference between two doubles
	public static double difference(double a, double b) {
		if (a > b) {
			double c = a - b;
			return c;
		}
		else {
			double c = b - a;
			return c;
		}	
	}
	}