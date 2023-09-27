import java.text.DecimalFormat;
public class ShippedOrder_Padilla extends Order_Padilla{
    static DecimalFormat cash = new DecimalFormat("Php #,##0.00");
    public double computeTotal(){total = itemPrice*itemCount; return total+228;}
    public void display(){
        System.out.println("[Shipped Order Details]");
        System.out.println("Customer Number < "+customerNo+
                "\nItem Description < "+itemInfo+
                "\nQuantity < "+itemCount+
                "\nPrice < "+cash.format(itemPrice)+
                "\nTotal Price < "+cash.format(computeTotal())+
                "\nHandling Charge < Php 228.00");
    }
}
