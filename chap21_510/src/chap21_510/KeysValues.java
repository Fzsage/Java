package chap21_510;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class KeysValues {

	public static void main(String[] args) {
		
		Map<Integer,String> bffs = new TreeMap<>();
		
		bffs.put(4, "Denny");
		bffs.put(3, "Penny");
		bffs.put(5, "Benny");
		bffs.put(1, "Jenny");
		bffs.put(2, "Henny");
		bffs.put(6, "Kenny");
		bffs.put(4, "Bob");
		
		System.out.println(bffs); // crude output
		
		Set<Integer> keys = bffs.keySet();
		Set<String> values = new TreeSet<String>(bffs.values());
		
		System.out.println(keys);
		System.out.println(values); // out of sync with keys
		
		for(Integer k : keys) {
			System.out.println("BFF " + k + " is " + bffs.get(k));
		}
	}
}
