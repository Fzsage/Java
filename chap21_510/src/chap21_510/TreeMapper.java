// TreeMapper.java

package chap21_510;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapper {

    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<String, String>();
        
        tm.put("DT", "Gerald McCoy");
        tm.put("RB", "Doug Martin");
        tm.put("WR", "Vincent Jackson");
        tm.put("QB", "Jameis Winston");
        
        System.out.println(tm);
        
        Set<Entry<String, String>> s = tm.entrySet();
        
        Iterator<Entry<String, String>> iter = s.iterator();
        Map.Entry<String, String> me;
        
        while( iter.hasNext() ) {
            me = iter.next();
            System.out.println(me.getKey() + " : " + me.getValue());
        }
        System.out.println( tm.get("QB") + " completed a pass to " + tm.get("WR"));
    }
}
