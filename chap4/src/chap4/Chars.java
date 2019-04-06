package chap4;

public class Chars {

	public static void main(String[] args) {
		
		char ch1 = 'A';  			// single quotes for type char
		char ch2 = 65;
		char ch3 = '\u0041';  		// Unicode. hex 41 equals 65
		char ch4 = (char)0x41;		// casting int to char
		
		System.out.println(ch1 == ch2);  // true
		System.out.println(ch1 == ch3);  // also true
		System.out.println(ch2 == ch4);	 // also true
		
		// casting chars to numeric types
		byte b1 = (byte)ch1;
		System.out.println(b1);
		
		int int1 = (int) 'B';
		System.out.println(int1);
		
		System.out.println(++ch1); 		// char is a NUMERIC type
		System.out.println('a' + 3);	// a is 97
		
		
	}

}
