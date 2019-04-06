package shoemake7and8;

public class TwoDimensions {

	public static void main(String[] args) {
		
		double[][] array = {
				{12.50, 3.50, 4.20},
				{8.20, 3.40, 1.80},
				{6.80, 4.90, 2.10}
		};
		
		double sumCol1 = 0;
		double sumCol2 = 0;
		double sumCol3 = 0;
		
		System.out.println("Here is the array");
		
		for(int row = 0; row < array.length; row++) {
			for(int col = 0; col < array[row].length; col++) {
				System.out.printf("%-8.2f", array[row][col]);
				if((double)col == 0) {
					sumCol1 += (double)array[row][col];
				}
				else if((double)col == 1) {
					sumCol2 += (double)array[row][col];
				}
				else {
					sumCol3 += (double)array[row][col];
				}
				
			}
			System.out.println();
		}
		
		System.out.printf("Column 1 total is %.2f%n", sumCol1);
		System.out.printf("Column 2 total is %.2f%n", sumCol2);
		System.out.printf("Column 3 total is %.2f%n", sumCol3);

	}

}
