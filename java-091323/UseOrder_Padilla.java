import java.util.*;
public class UseOrder_Padilla {
    static Scanner kace = new Scanner(System.in);
    public static void main(String[] args) {
        Order_Padilla order = new Order_Padilla();
        System.out.println("[Enter Order Details]");
        System.out.print("Customer Number > "); order.setCustomerNo(kace.nextInt());
        kace.nextLine();
        System.out.print("Item Description > "); order.setItemInfo(kace.nextLine());
        System.out.print("Quantity > "); order.setItemCount(kace.nextInt());
        System.out.print("Price > Php "); order.setItemPrice(kace.nextDouble());
        ShippedOrder_Padilla shipOrder = new ShippedOrder_Padilla();
        System.out.println("[Enter Shipped Order Details]");
        System.out.print("Customer Number > "); shipOrder.setCustomerNo(kace.nextInt());
        kace.nextLine();
        System.out.print("Item Description > "); shipOrder.setItemInfo(kace.nextLine());
        System.out.print("Quantity > "); shipOrder.setItemCount(kace.nextInt());
        System.out.print("Price > Php "); shipOrder.setItemPrice(kace.nextDouble());
        order.display();
        shipOrder.display();
    }
}
