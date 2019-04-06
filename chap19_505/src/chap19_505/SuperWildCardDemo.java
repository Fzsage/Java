package chap19_505;

public class SuperWildCardDemo {
	public static void main(String[] args) {
		GenericStack<String> stack1 = new GenericStack<String>();
		GenericStack<Object> stack2 = new GenericStack<Object>();   // can hold any type
		
		stack2.push("Java");		// a String
		stack2.push(2);				// an Integer
		stack1.push("Sun");			// another String but stack1
		
		add(stack1, stack2);
		
		AnyWildCardDemo.print(stack2);
	}

	public static <T> void add(GenericStack<T> stack1,GenericStack<? super T> stack2) {
		while (!stack1.isEmpty())
			stack2.push(stack1.pop());
	}
}