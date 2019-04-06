// LinkedHashSetOne.java

package chap21_510;

import java.util.*;

public class LinkedHashSetOne {

    public static void main(String[] args) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        hs.add(5);		// autoboxed to an Integer
        hs.add(10);
        hs.add(15);
        hs.add(20);        
        hs.add(25);
        hs.add(15);  	//duplicate, so not added        
        
        System.out.println(hs); // ordered as entered
    }
}
