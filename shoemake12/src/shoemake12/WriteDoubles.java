package shoemake12;

public class WriteDoubles {

	public static void main(String[] args) throws Exception {
		
		java.io.File file = new java.io.File("doubles.txt"); // Open new file
		if (file.exists()) {								 // Exception if file already exists	
		      System.out.println("File already exists");
		      System.exit(0);
		    }
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		double[] doubleAra = new double[10]; // Array initializer 
		for(int i = 0; i < doubleAra.length; i++) {
		      doubleAra[i] = (double)(Math.random()*11 + 1); // Fill array with random doubles 1-11
		      output.println(doubleAra[i]); // Write the double to the file
		    }
		
		output.close(); // Close the file
	}

}
