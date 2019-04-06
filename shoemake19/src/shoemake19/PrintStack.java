package shoemake19;

public class PrintStack {

	public static void main(String[] args) {

		GenericStack<Printed> stack = new GenericStack<>(); // Create empty Generic Stack
		stack.push(new Book("One Bullet Away", "Autobiography")); // add new Book, Textbook, blog to stack anonymously
		stack.push(new TextBook("Intro to Java", "Educational", "Programming"));
		stack.push(new Blog("Java World", "Programming", "Basic"));
		// stack.push(new Printed("Printed")); abstract classes cannot be instantiated
		
		
		show(stack); // Print attributes and distributed method of Printed objects in stack

	}
	
	// generic method
	public static <E> void show(E stack) { 
		while(!((GenericStack<E>) stack).isEmpty()){ // while stack is not empty
			
			
			System.out.println(((GenericStack<E>) stack).peek()); // print attributes for object on top of stack
			System.out.println(((Printed) ((GenericStack<E>) stack).peek()).distribution()); // run distribution method for object on top of stack
			((GenericStack<E>) stack).pop(); // remove top object from stack
			}
		
		
	}
}
