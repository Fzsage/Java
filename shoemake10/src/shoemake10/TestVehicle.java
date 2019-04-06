/*package shoemake10;

public class TestVehicle {

	public static void main(String[] args) {
		
		Motor motor1 = new Motor(4, 265, "Gas");
		
		Vehicle vehicle1 = new Vehicle("Subaru", "WRX", 2017, 28895.00, motor1);
		Vehicle vehicle2 = new Vehicle("Subaru", "BRZ", 2016, 25895.00, motor1);
		
		System.out.print(vehicle1.toString());
		System.out.println(); System.out.println();
		System.out.print(vehicle2.toString());

		
	}

}*/

package shoemake10;
//KATHRYN BORNE #380050

public class TestVehicle {

	public static void main(String[] args) {
		// make 2-3 vehicle instances and display status

		Motor motor1 = new Motor(4, 170, "Gas");	
		Motor motor2 = new Motor(8, 707, "Gas");
		Motor motor3 = new Motor(8, 121, "hybrid");
		
		//motor1.getType();

		Vehicle vehicleone = new Vehicle("Nissan", "Rogue", 2016, 28000.0, motor1);
		Vehicle vehicletwo = new Vehicle("Dodge", "Challenger Hellcat", 2015, 62000.0, motor2);
		Vehicle vehiclethree = new Vehicle("Toyota", "Prius Two Eco", 2017, 25165.0, motor3);

		System.out.println(vehicleone); 
		System.out.println(vehicletwo); 
		System.out.println(vehiclethree); 


	}

}
