package shoemake6;

public class Stringer {
	
	public static void stringer(String name) {
		// Print the name alphabetically using substring method of string class
		System.out.println("Alphabetically, your name is "  + name.substring(name.indexOf(" "), name.length()) + ", " + name.substring(0, name.indexOf(" ")));
		// Use loop to iterate over string backwards and print name backwards
		System.out.print("Your name backwards is ");
			for (int i = name.length()-1; i >= 0; i--) {
				System.out.print(name.charAt(i));
		}
		// Print the number of characters in the name. -1 for space
		System.out.println("\nYour name has " + (name.length() - 1) + " characters");	
	}
}
