// HashMapOne.java

package chap21_510;

import java.util.*;
import java.util.Map.Entry;

public class HashMapTwo {

    public static void main(String[] args) {
        HashMap<String, String> inventory = new HashMap<String, String>();
        inventory.put( "BK222", "Voit basketball" );
        inventory.put( "BB345", "Rawlings baseball" );
        inventory.put( "FB098", "Spalding football" );
          
        Set<Entry<String, String>> set = inventory.entrySet(); // Map has no iterator
        Iterator<Entry<String, String>> iter = set.iterator();
        
        while(iter.hasNext())  {
            System.out.println( iter.next());
        }
        
        // another way to loop through a Map
        Set<Map.Entry<String, String>> invSet = inventory.entrySet();
        System.out.println(invSet);
        for(Map.Entry<String, String> s : invSet) {
        	System.out.println("The " + s.getValue() + " SKU code is " + s.getKey());
        }
        
        
        
    }
}
