package shoemake21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class PresQuiz {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(); // create map to hold president # and respective president

		tm.put(35, "Kennedy"); // add presidents to map
		tm.put(36, "Johnson");
		tm.put(37, "Nixon");
		tm.put(38, "Ford");
		tm.put(39, "Carter");
		tm.put(40, "Reagan");
		tm.put(41, "Bush");
		tm.put(42, "Clinton");
		tm.put(43, "W Bush");
		tm.put(44, "Obama");

		System.out.println("Size of map: " + tm.size()); // print no. of entries in map

		Set<Entry<Integer, String>> s = tm.entrySet(); // create iterator for map
		Iterator<Entry<Integer, String>> iter = s.iterator();
		Map.Entry<Integer, String> me;

		while (iter.hasNext()) { // print presidents 35-44
			me = iter.next();
			System.out.println("President #" + me.getKey() + ": " + me.getValue());
		}

		System.out.println("\nPresidents Quiz\n");

		HashSet<Integer> hs = new HashSet<Integer>(); // create a set of random integers; pool for quiz to pull from
		while (hs.size() < 5) {
			hs.add(ThreadLocalRandom.current().nextInt(35, 44 + 1));
		}

		Scanner input = new Scanner(System.in); 
		int score = 0; // intialize accumulator for score

		Iterator<Integer> hsIter = hs.iterator(); // iterate through random numbers
		while (hsIter.hasNext()) {
			int presNum = hsIter.next(); 
			System.out.println("Who was president #" + presNum + "?"); // ask for president of random number 
			String answer = input.nextLine();
			if (answer.equals(tm.get(presNum))) { // if answer = random num, +1 score
				score++;
			}
		}
		input.close();

		System.out.println("\nYour score was " + score); // print total score
		System.out.println("\nHere are the last 10 presidents in alphabetical order:");

		TreeSet<String> treeSet = new TreeSet<String>(); // set to hold all presidents, sorted

		Set<Entry<Integer, String>> mapString = tm.entrySet(); // iterator for map
		Iterator<Entry<Integer, String>> mapIter = mapString.iterator();
		Map.Entry<Integer, String> mapE;

		while (mapIter.hasNext()) { // iterate through map, add values (president name) to sorted set
			mapE = mapIter.next();
			treeSet.add(mapE.getValue());
		}

		for (String pres : treeSet) { // print presidents alphabetically
			System.out.println(pres);
		}
	}

}
