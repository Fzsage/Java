// HashSetOne.java

package chap21_510;

import java.util.*;

public class HashSetOne {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Andy");
        hs.add("Carrie");
        hs.add("Betty");
        hs.add("Ernie");        
        hs.add("Dorothy");
        hs.add("Tommy");
        hs.add("Carrie");  //duplicate, so not added        
        
        System.out.println(hs); //note order uncontrollable
    }
}
