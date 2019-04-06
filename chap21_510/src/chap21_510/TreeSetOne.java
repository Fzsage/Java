// TreeSetOne.java

package chap21_510;

import java.util.*;

public class TreeSetOne {

    public static void main(String[] args) {
        HashSet<Double> hs = new HashSet<Double>();
        hs.add(2.22);
        hs.add(44.4);
        hs.add(5.55);
        hs.add(66.66);        
        hs.add(33.33);
        hs.add(5.55);  //duplicate, so not added        
        
        TreeSet<Double> ts = new TreeSet<Double>(hs);

        System.out.println("HashSet hs: " + hs); //note elements are NOT in entry order        
        System.out.println("TreeSet ts: " + ts); //note elements now sorted
        
        ts.add(1.11);
        System.out.println("TreeSet ts: " + ts); //note elements resorted        
    }
}
