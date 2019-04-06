package chap4;

public class FormatPrint {

	public static void main(String[] args) {
		
		int hrs = 35;
		double wage = 17.50;
		String name = "Annabelle";
		
		System.out.printf("%s was paid $%.2f for %d hours last week.\n",name,hrs * wage,hrs);
		
		char grade = 'A';
		int score = 90;
		System.out.printf("A score of %d%% or more earns grade %c.\n", score,grade);
		
		System.out.printf("You can call %s %.4s.\n", name,name);
		
		// number before dot specifies column width
		System.out.printf("%12.3f %20.4f \n", wage, wage);
		
		// negative number before column width means start at left margin
		System.out.printf("%-12.2f %12.2f \n", wage, wage);
		System.out.printf("%-12.2f %12.2f \n", 100.0, 200.0);
		System.out.printf("%-12.2f %12.2f \n", 300.0, 400.0);
		
	}

}
