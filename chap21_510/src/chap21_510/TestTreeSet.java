package chap21_510;

import java.util.*;

public class TestTreeSet {
  public static void main(String[] args) {
    // Create a hash set
    Set<String> set = new HashSet<String>();

    // Add strings to the set
    set.add("London");
    set.add("Paris");
    set.add("New York");
    set.add("San Francisco");
    set.add("Beijing");
    set.add("New York");

    TreeSet<String> treeSet = new TreeSet<String>(set);
    System.out.println("Sorted tree set: " + treeSet);

    // Use the methods in SortedSet interface
    System.out.println("first(): " + treeSet.first());
    System.out.println("last(): " + treeSet.last());
    System.out.println("headSet(): " + treeSet.headSet("New York"));
    System.out.println("tailSet(): " + treeSet.tailSet("New York"));

    // Use the methods in NavigableSet interface
    System.out.println("lower(\"Paris\"): " + treeSet.lower("Paris"));
    System.out.println("higher(\"Paris\"): " + treeSet.higher("Paris"));
    System.out.println("floor(\"Paris\"): " + treeSet.floor("Paris"));
    System.out.println("ceiling(\"Paris\"): " + treeSet.ceiling("Paris"));
    System.out.println("pollFirst(): " + treeSet.pollFirst());
    System.out.println("pollLast(): " + treeSet.pollLast());
    System.out.println("New tree set: " + treeSet);
  }
}
