// TreeInventoryComparator.java

package chap21_510;

import java.util.*;

public class TestInventoryComparator {

    public static void main(String[] args) {
        Set<InventoryValue> ts = 
                new TreeSet<InventoryValue>(new InventoryComparator());
        ts.add(new InventoryValue(3, 2.50));
        ts.add(new InventoryValue(6, 1.00));
        ts.add(new InventoryValue(8, 0.70));
        ts.add(new InventoryValue(2, 2.00));        
        
        System.out.println("Inventory Sorted by Total Value");         
        for( InventoryValue item: ts) {
            System.out.println(item.getValue());                    
        }
    }
}
