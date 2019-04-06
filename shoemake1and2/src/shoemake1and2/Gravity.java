// Sage Shoemake
// This program will calculate the approximate force of gravity in newtons between the Earth and moon

package shoemake1and2;

public class Gravity {

	public static void main(String[] args) {
		
		//assign variables for easier calculation
		double earthmass = 6.0E24;
		double moonmass = 7.4E22;
		double distance = 3.8E8;
		double gravityconstant = 6.6E-13;
		
		//calculate force f=g(m1m2/r2)
		double force = gravityconstant * ((earthmass * moonmass) / (distance * distance));
		
		System.out.println("The approximate force in gravity between the Earth and moon is " + force + " newtons.");
		

	}

}
