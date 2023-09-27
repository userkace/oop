// Padilla, Kervin Clyde S. | CS202

public class Purchase {
    private static int invoiceNumber;
    private static double saleAmount;
    private static double salesTax = 0.05;
    private static double totalSale = 0;
    private static double totalTax = 0;

    Purchase(int invoice, double sale){
        invoiceNumber = invoice;
        saleAmount = sale;
    }

    void display(){
        System.out.println("Invoice < "+invoiceNumber);
        System.out.println("Price < Php "+saleAmount);
        System.out.println("Tax < Php "+ (saleAmount*salesTax));
    }
    void computeTotal(){
        totalSale+=saleAmount;
        totalTax+=(saleAmount*salesTax);
    }
    static void totalDisplay(){
        System.out.println("\n[Purchase Total]");
        System.out.println("Total Purchases < Php "+ (totalSale));
        System.out.println("Total Tax < Php "+ (totalTax));
    }
}
