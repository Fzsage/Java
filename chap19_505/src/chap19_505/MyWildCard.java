package chap19_505;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class MyWildCard {

	public static void main(String[] args) {

		MyList<Integer> integers = new MyList<Integer>();
		integers.add(10);
		integers.add(20);
		integers.add(30);

		display(integers);
	}

	public static void display(MyList<?> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}

	static class MyList<E> extends ArrayList<E> {
		// added nothing, just a "new" type of ArrayList
	}
}
