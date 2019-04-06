/* InventoryComparator.java */

package chap21_510;

import java.util.Comparator;

@SuppressWarnings("serial")
public class InventoryComparator
         implements Comparator<InventoryValue>, java.io.Serializable {
    
    public int compare(InventoryValue val1, InventoryValue val2) {
        double value1 = val1.getValue();
        double value2 = val2.getValue();
        if( value1 < value2) {
            return -1;
        }
        else if(value1 == value2) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
