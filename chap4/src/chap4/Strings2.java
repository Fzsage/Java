package chap4;

public class Strings2 {

	public static void main(String[] args) {
		
		String fruit = "bananas";
		System.out.println(fruit.substring(3));
		System.out.println(fruit.substring(2,6));  // from 2 to one less than 6
		System.out.println(fruit.substring(0,3));  // from 0 to 2, first 3 charas.	
		
		System.out.println(fruit.indexOf('n'));
		System.out.println(fruit.lastIndexOf('n'));
		
		String s = "2345";
		System.out.println(Integer.parseInt(s));
		
		double num = Double.parseDouble("12.25");
		System.out.println(Math.sqrt(num));
		
		int number = 10;
		String address = number + " Downing St";  // concatenates okay
		System.out.println(address);
		
		
	}

}
