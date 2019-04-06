package chap19_505;

import java.util.ArrayList;

public class TestPrinted {

	public static void main(String[] args) {
		
		Book classic = new Book("Moby Dick", "fiction");
		TextBook liang = new TextBook("Intro to Java","programming","Java");
		Blog women = new Blog("liveyourdream.org","empowerment","self-actualization");
		
		GenericStack <Printed> stack = new GenericStack<>();
		stack.push(classic);
		stack.push(liang);
		stack.push(women);
		show(stack);

		System.out.println("Now, output of test method");
		
		ArrayList<Book> obs = new ArrayList<Book>();
		obs.add(liang);
		obs.add(classic);
		//obs.add(women);    // not applicable
		test(obs);

	}
	
	public static void show(GenericStack <? extends Printed> ob) {
		int sz = ob.getSize();
		for(int i = 0; i < sz; i++) {
			System.out.println(ob.pop());
		}
		
	}

	public static void test(ArrayList <? super TextBook> tb) {
		for(int i = 0; i < tb.size(); i++) {
			System.out.println(tb.get(i));
		}
	}

}
