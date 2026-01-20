import java.util.*;
public class KilometersToMiles {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("enter the km :");
        int km = sa.nextInt();

        double Miles = km * 0.621371;
        System.out.printf("km in miles is : %.2f miles" , Miles);
    }
}
