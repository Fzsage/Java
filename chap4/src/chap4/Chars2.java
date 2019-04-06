package chap4;

public class Chars2 {

	public static void main(String[] args) {
		
		// the Character class is a 'wrapper" for type char
		
		char ch1 = 'B';
		char ch2 = 48;
		char ch3 = 0x3a;
		
		System.out.println(Character.isDigit(ch2));			// true it's a 0
		System.out.println(Character.isLetter(ch2));		// false
		System.out.println(Character.isLetter(ch3));		// false it's a semicolon
		
		System.out.println(Character.toLowerCase(ch1));		// outputs b
		
		
	}

}
