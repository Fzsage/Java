/* InventoryValue.java */

package chap21_510;

public class InventoryValue  {
    private int numInStock;
    private double unitPrice;
    
    public InventoryValue(int num, double price) {
        numInStock = num;
        unitPrice = price;
    }
    
    public double getValue() {
        return numInStock * unitPrice;
    }
}
