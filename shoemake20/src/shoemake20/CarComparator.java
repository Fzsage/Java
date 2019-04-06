package shoemake20;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

	@Override
	public int compare(Car c1, Car c2) {
		if(c1.getPrice() > c2.getPrice()){
			return 1;
		}
		if(c1.getPrice() < c2.getPrice()){
			return -1;
		}
		else{
		return 0;
		}
	}

}
