package chap4;

import java.util.Scanner;

public class Strings0 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Who made Java?");
		
		String name1 = input.next();
		String name2 = input.next();
		input.close();
		
		System.out.println(name1 + " " + name2 + " made Java");
	}

}
