import java.text.DecimalFormat;
public class Order_Padilla {
    static DecimalFormat cash = new DecimalFormat("Php #,##0.00");
    protected int customerNo;
    protected String itemInfo;
    protected double itemPrice;
    protected int itemCount;
    protected double total;
    public int getCustomerNo() {return customerNo;}
    public int getItemCount() {return itemCount;}
    public double getItemPrice() {return itemPrice;}
    public String getItemInfo() {return itemInfo;}
    public void setCustomerNo(int customerNo) {this.customerNo = customerNo;}
    public void setItemCount(int itemCount) {this.itemCount = itemCount;}
    public void setItemInfo(String itemInfo) {this.itemInfo = itemInfo;}
    public void setItemPrice(double itemPrice) {this.itemPrice = itemPrice;}
    public double computeTotal(){total = itemPrice*itemCount; return total;}
    public void display(){
        System.out.println("[Order Details]");
        System.out.println("Customer Number < "+customerNo+
                "\nItem Description < "+itemInfo+
                "\nQuantity < "+itemCount+
                "\nPrice < "+cash.format(itemPrice)+
                "\nTotal Price < "+cash.format(computeTotal()));
    }
}
