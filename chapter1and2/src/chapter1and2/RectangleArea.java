package chapter1and2;

import java.util.Scanner;

public class RectangleArea {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length");
		double length = input.nextDouble();
		System.out.println("Enter width");
		double width = input.nextDouble();
		input.close();
		double area = length * width;
		System.out.println("The area is " + area);
		
	}
}

