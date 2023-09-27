import java.text.*;
public class carRental {
    static DecimalFormat cash = new DecimalFormat("₱ #,###.00");
    protected String name;
    protected int zip;
    protected int size;
    protected String carSize;
    protected double rent;
    protected int days;
    protected double total;
    protected carRental(String name, int zip, int size, int days){
        this.name = name;
        this.zip = zip;
        this.size = size;
        this.days = days;
        if (size == 1) { rent = 1702.53; carSize = "Economy"; }
        else if (size == 2) { rent = 2213.46; carSize = "Midsize"; }
        else if (size == 3) { rent = 2468.50; carSize = "Fullsize"; }
        total = rent * this.days;
    }
    public static void menu(){
        System.out.println("[Choose car size]");
        System.out.println("[1] Economy");
        System.out.println("[2] Midsize");
        System.out.println("[3] Fullsize");
        System.out.println("[4] Luxury");
        System.out.println("[5] Exit");
    }
    protected void display(){
        System.out.println("\n[Renting Invoice]");
        System.out.println("Renter's name < "+name);
        System.out.println("Renter's zip code < "+zip);
        System.out.println("Car size < "+carSize);
        System.out.println("Rent per day < "+ cash.format(rent));
        System.out.println("Days rented < "+days);
        System.out.println("Total due < "+ cash.format(total));
    }
}
