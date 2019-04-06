package shoemake19;


import java.util.ArrayList;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class ObjectsArray {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(2, 4); // create rectangle, circle, string, integer
		Circle circ = new Circle(2, 4, 4);
		String str = "Hello World";
		Integer num = new Integer(12);

		ArrayList<Object> list = new ArrayList<Object>(); // create empty arrayList to hold objects
		list.add(rect); // add objects to array list
		list.add(circ);
		list.add(str);
		list.add(num);
		
		process(list); // call method
		
	}

	private static void process(ArrayList<Object> list) {
		for (int i = 0; i < list.size(); i++){
			if(list.get(i) instanceof Rectangle){ // if index in iteration is rectangle, calculate area and print
				System.out.println("Area of rectangle is " + (((Rectangle) list.get(i)).getHeight() * ((Rectangle) list.get(i)).getWidth()));
			}
			else if(list.get(i) instanceof Circle){ // // if index in iteration is Circle, calculate area and print
				System.out.println("Area of circle is " + ((((Circle) list.get(i)).getRadius() * ((Circle) list.get(i)).getRadius())) * Math.PI);
			}
			else{ // if string or integer, run toString method
				System.out.println(list.get(i).toString());
			}
			
		}
		
	}


}
