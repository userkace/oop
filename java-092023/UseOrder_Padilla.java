import java.util.*;
public class UseOrder_Padilla {
    static int customerNo, customerNo2;
    static String itemInfo, itemInfo2;
    static double itemPrice, itemPrice2;
    static int itemCount, itemCount2;
    static boolean value = true;
    static Scanner kace = new Scanner(System.in);

    public static void main(String[] args) {
        try{
            System.out.println("[Enter Order Details]");
            System.out.print("Customer Number > "); customerNo = kace.nextInt();
            kace.nextLine();
            System.out.print("Item Description > "); itemInfo = kace.nextLine();
            System.out.print("Quantity > "); itemCount = kace.nextInt();
            System.out.print("Price > Php "); itemPrice = kace.nextDouble();
            check(customerNo,itemPrice,itemCount);
            System.out.println("[Enter Shipped Order Details]");
            System.out.print("Customer Number > "); customerNo2 = kace.nextInt();
            kace.nextLine();
            System.out.print("Item Description > "); itemInfo2 = kace.nextLine();
            System.out.print("Quantity > "); itemCount2 = kace.nextInt();
            System.out.print("Price > Php "); itemPrice2 = kace.nextDouble();
            check(customerNo2,itemPrice2,itemCount2);
        }
        catch(InputMismatchException mismatch){
            value = false; System.out.println(DataMessages_Padilla.messages[0]);
        }
        catch(DataException_Padilla mismatch){
            System.out.println("!!! Out of range.");
            System.out.println(mismatch.getMessage());
        }
        Order_Padilla order = new Order_Padilla(customerNo,itemInfo,itemPrice,itemCount);
        ShippedOrder_Padilla shipOrder = new ShippedOrder_Padilla(customerNo2,itemInfo2,itemPrice2,itemCount2);
        if (value == true) {
            order.display();
            shipOrder.display();
        }
    }
    static void check(int customerNo, double itemPrice, int itemCount) throws DataException_Padilla {
        if (customerNo<1000){
            value = false; throw(new DataException_Padilla(DataMessages_Padilla.messages[1]));
        }
        if (customerNo>5000){
            value = false; throw(new DataException_Padilla(DataMessages_Padilla.messages[2]));
        }
        if (itemCount<0){
            value = false; throw(new DataException_Padilla(DataMessages_Padilla.messages[3]));
        }
        if (itemPrice<0){
            value = false; throw(new DataException_Padilla(DataMessages_Padilla.messages[4]));
        }
        if (itemPrice>10000){
            value = false; throw(new DataException_Padilla(DataMessages_Padilla.messages[5]));
        }
    }
}
