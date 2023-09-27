public class luxuryRental extends carRental{
    protected double chaueffer = 11754.00;
    protected luxuryRental(String name, int zip, int size, int days){
        super(name, zip, size, days);
        rent = 4621.02;
        carSize = "Luxury";
        total = (rent + chaueffer) * super.days;
    }
    protected void display(){
        super.display();
        System.out.println("!!!Notice, Chaueffer fee < "+cash.format(chaueffer*super.days));
    }
}
