// Padilla, Kervin Clyde S. | CS202

import java.util.*;

public class PurchaseArray{
    static Scanner sc = new Scanner(System.in);

    static Purchase inputData(){
    System.out.println("[Input Purchase Details]");
    System.out.print("Invoice < ");
    int invoice = sc.nextInt();
    while((invoice<1000)||(invoice>8000)){
        System.out.println("!!! Enter valid integer.\n[1000-8000]");
        invoice = sc.nextInt();
    }
    sc.nextLine();
    System.out.print("Price < Php ");
    double sale = sc.nextDouble();
    while((sale<=0)){
        System.out.println("!!! Enter valid integer.\n[nonzero & nonnegative]");
        System.out.print("Php ");
        sale = sc.nextDouble();
    }
        Purchase purchases = new Purchase(invoice, sale);
        return purchases;
    }
    public static void main(String[] args) {
        Purchase[] purchases = new Purchase[5];
        for (int i=0; i<5; i++){
            System.out.println("\nEnter details for Purchase < " + (i+1));
            purchases[i] = inputData();
        }
        for (int i=0; i<5; i++){
            System.out.println("\nPurchase no. < "+(i+1));
            purchases[i].computeTotal();
            purchases[i].display(); 
        }
        Purchase.totalDisplay();
    }
}