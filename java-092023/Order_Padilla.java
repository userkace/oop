import java.text.DecimalFormat;
public class Order_Padilla {
    static DecimalFormat cash = new DecimalFormat("Php #,##0.00");
    protected int customerNo;
    protected String itemInfo;
    protected double itemPrice;
    protected int itemCount;
    protected double total;
    protected Order_Padilla(int customerNo, String itemInfo, double itemPrice, int itemCount){
        this.customerNo = customerNo;
        this.itemInfo = itemInfo;
        this.itemPrice = itemPrice;
        this.itemCount = itemCount;
    }
    public double computeTotal(){total = itemPrice*itemCount; return total;}
    public void display(){
        System.out.println("\n[Order Details]");
        System.out.println("Customer Number < "+customerNo+
                "\nItem Description < "+itemInfo+
                "\nQuantity < "+itemCount+
                "\nPrice < "+cash.format(itemPrice)+
                "\nTotal Price < "+cash.format(computeTotal()));
    }
}
