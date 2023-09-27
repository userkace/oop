// Padilla, Kervin Clyde S. | CS202

import java.util.*;

public class Array1{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] frequency = new int[101];
        int num;
        System.out.println("[Enter postive integers]");
        System.out.println("(input -999 to exit)");
        while((num=sc.nextInt())!=-999){
            if (num>=0 && num<=100){
                frequency[num]++;
            } else {
                System.out.println("!!! Enter valid integer.");
            }
        }
        System.out.println("Number\tFrequency");
        for (int i=0;i<frequency.length;i++){
            if (frequency[i]==0){
            } else {
                System.out.println((i)+"\t"+frequency[i]);
            }
        }
    }
}