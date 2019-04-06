package chap4;

public class Strings1 {

	public static void main(String[] args) {
		
		// In Java, a string is an object type, an instance of class String
		String javaMan = "James Gosling";
		System.out.println(javaMan.length());
		
		// Characters are indexed starting from zero
		System.out.println(javaMan.charAt(0));
		System.out.println(Character.isLowerCase(javaMan.charAt(0)));		

		System.out.println(javaMan.endsWith("sling"));
		System.out.println(javaMan.contains("es Go"));
		
		String lang1 = "Java";
		String lang2 = "Java";
		System.out.println(lang1 == lang2);
		System.out.println(lang1.equals(lang2));	// better test
		System.out.println(lang1.compareTo(lang2)); // returns 0 if equal
	}

}
