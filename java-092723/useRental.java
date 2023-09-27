import javax.xml.crypto.Data;
import java.util.*;
import static java.lang.System.exit;
public class useRental {
    static Scanner kace = new Scanner (System.in);
    public static void main(String[] args) throws DataException {
        try {
            System.out.println("[Car Details]");
            System.out.print("Renter's name > ");
            String name = kace.nextLine();
            System.out.print("Renter's zip code > "); int zip = kace.nextInt();
            System.out.print("Days to rent > "); int days = kace.nextInt();
            carRental.menu();
            System.out.print("Car size > "); int size = kace.nextInt();
            check(name, zip, size, days);
        } catch(InputMismatchException mismatch){
            throw(new DataException(6));
        }
    }
    static void check(String name, int zip, int size, int days) throws DataException{
        if (zip < 1000){ throw(new DataException(4)); }
        else if (zip > 9999){ throw(new DataException(5)); }
        if (days < 1) { throw(new DataException(2)); }
        else if (days > 15) { throw(new DataException(3)); }
        if (size==1||size==2||size==3){ carRental car = new carRental(name,zip,size,days); car.display();}
        else if (size==4){ luxuryRental car = new luxuryRental(name, zip, size, days); car.display();}
        else if (size==5){ System.out.println("{program ended.}");System.out.println("\nThank you for your patronage!");exit(202); }
        else{ throw(new DataException(1)); }
    }
    public static class DataException extends Exception{
        public DataException(int code) {
            System.out.print(messages[0]+messages[code]);
        }
        public static final String[] messages = {"\n!!!Error. ",
                "\nChoice not valid!\n",
                "\nRental days < minimum [1]\n",
                "\nRental days > maximum [15]\n",
                "\nZip code < minimum [1000]\n",
                "\nZip code > maximum[9999]\n",
                "\nData not numeric!\n"};
    }
}