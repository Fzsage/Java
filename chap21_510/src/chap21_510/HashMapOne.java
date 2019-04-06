// HashMapOne.java

package chap21_510;

import java.util.*;
import java.util.Map.Entry;

public class HashMapOne {

    public static void main(String[] args) {
        HashMap<String, String> inventory = new HashMap<String, String>();
        inventory.put( "BK222", "Voit basketball" );
        inventory.put( "BB345", "Rawlings baseball" );
        inventory.put( "FB098", "Spalding football" );
        
        System.out.println( inventory.get( "BK222" ));
        
        if( inventory.containsValue( "Spalding football" ) ) {
            System.out.println( "We have footballs in stock ");
        }
        
        Set<Entry<String, String>> set = inventory.entrySet(); // Map has no iterator
        Iterator<Entry<String, String>> iter = set.iterator();
        
        while( iter.hasNext())  {
            System.out.println( iter.next());
        }
    }
}
