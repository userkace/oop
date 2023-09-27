import java.util.*;
import java.io.*;
public class PlaceAnOrder {
    static Scanner sc = new Scanner(System.in);
    static double total=0;
    static double price;
    public static void main(String[] args) {
        int id, cnt, code=0;

        System.out.println("Id - Prices" +
                "111 - 50.77" +
                "222 - 83.85" +
                "333 - 138.61" +
                "444 - 341.67");
        try{
            System.out.print("Enter id number > ");
            id = sc.nextInt();
            System.out.print("Enter quantity > ");
            cnt
                    = sc.nextInt();
            check(id,cnt);
            System.out.println(OrderMessages.messages[code]);
            if(id==111){price=50.77; total+=(price*cnt);}
            else if (id==222){price=83.85; total+=(price*cnt);}
            else if (id==333){price=138.61; total+=(price*cnt);}
            else if (id==444){price=341.67; total+=(price*cnt);}
            System.out.println("Complete Order. Total < Php "+String.format("%,.2f",total));
            System.out.println("\t\t["+cnt+" qty.] at Php "+String.format("%,.2f",price));

        }
        catch(InputMismatchException mismatch){
            code = 1;
            System.out.println(OrderMessages.messages[code]);
        }
        catch(OrderException mismatch){
            System.out.println(mismatch.getMessage());
        }
    }
    static void check(int id, int cnt) throws OrderException {
        int code=2;
        if (id<0) throw(new OrderException(OrderMessages.messages[code]));
        code=3;
        if (id>9999) throw(new OrderException(OrderMessages.messages[code]));
        code=4;
        if (cnt<1) throw(new OrderException(OrderMessages.messages[code]));
        code=5;
        if (cnt>12) throw(new OrderException(OrderMessages.messages[code]));
        code=6;
        if (!(id==444||id==333||id==222||id==111)) throw (new OrderException(OrderMessages.messages[code]));

    }
}
